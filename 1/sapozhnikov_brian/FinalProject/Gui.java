import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Gui extends JFrame implements ActionListener{
    private Gui gui = this;
    private Container pane;
    private GridBagConstraints c = new GridBagConstraints();
    private Board board = new Board(10,10);
    private Ship currentShip = null;
    private JLabel messages;
    
    //determines stage of the game
    private boolean shipBuildMode = false;

    //buttons only used in certain stages
    private Container buildMainButtons;
    private Container buildNewShipButtons;
    private JButton newShip;
    private JTextField name;
    private JButton enterName;

    //text snippets
    String shipBuildingModeMessage = "<html>You are in Ship Building Mode. <br><hr><br>";

    
    private class partKeyListener implements KeyListener {
	public void keyPressed(KeyEvent e){
	   
	}
	public void keyReleased(KeyEvent e){

	}
	public void keyTyped(KeyEvent e){

	}
    }
    private class emptyKeyListener implements KeyListener {
	public void keyPressed(KeyEvent e){
	    
	}
	public void keyReleased(KeyEvent e){

	}
	public void keyTyped(KeyEvent e){
	   
	}
    }

    private class partMouseListener implements MouseListener {
	public void mouseClicked(MouseEvent e){
	    System.out.println("Ship Part pressed.");
	}
	public void mouseEntered(MouseEvent e){

	}
	public void mouseExited(MouseEvent e){

	}
	public void mousePressed(MouseEvent e){

	}
	public void mouseReleased(MouseEvent e){

	}
    }
    private class emptyMouseListener implements MouseListener {
	public void mouseClicked(MouseEvent e){
	    if (currentShip != null){
		JPanel p = (JPanel)(e.getSource());
		int pX = p.getX()/20;
		int pY = p.getY()/20;
		ShipPart newPart = new ShipPart(currentShip); 
		board.set(pY, pX, newPart);
		currentShip.addPart(newPart);
		System.out.println(board);
		//System.out.println(Arrays.toString(newPart.getMouseListeners()));
		//newPart.removeMouseListener(newPart.getMouseListeners()[0]);
		newPart.addMouseListener(new partMouseListener());
		newPart.setBorder(BorderFactory.createLineBorder(Color.red,2));
		newPart.setBackground(Color.red);
		board.remove(pY*10+pX);
		board.add(newPart, pY*10+pX);
		board.revalidate();
		board.repaint();
		pane.revalidate();
		pane.repaint();
		pane.update(gui.getGraphics());
	    }
	}
	public void mouseEntered(MouseEvent e){

	}
	public void mouseExited(MouseEvent e){

	}
	public void mousePressed(MouseEvent e){

	}
	public void mouseReleased(MouseEvent e){

	}
    }

    public void shipBuildingMode(){
	String text = shipBuildingModeMessage;
	text = text + "Click \"New Ship\" to begin creating a new ship.";
	messages.setText(text);
	newShip = new JButton("New Ship");
	newShip.addActionListener(this);
	buildMainButtons.add(newShip);
	pane.update(this.getGraphics());
    }

    
    
    public Gui(){
	//format gui
	setTitle("Insert Awesome Title");
	setSize(600,400);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = this.getContentPane();
	pane.setLayout(new GridBagLayout());
	

	//board
	c.weightx = 0.5;
	c.gridx = 0;
	c.gridy = 0;
	board.setLayout(new GridLayout(10,10));
	pane.add(board,c);

        buildMainButtons = new Container();
	c.weightx = 0.2;
	c.gridx = 0;
	c.gridy = 1;
	buildMainButtons.setLayout(new FlowLayout());
	pane.add(buildMainButtons,c);

	buildNewShipButtons = new Container();
	buildNewShipButtons.setLayout(new FlowLayout());
	name = new JTextField(10);
	name.addActionListener(this);
	buildNewShipButtons.add(name);
	enterName = new JButton("Enter Name");
	enterName.addActionListener(this);
	buildNewShipButtons.add(enterName);

	messages = new JLabel();
	c.weightx = 0.5;
	c.gridx = 1;
	c.gridy = 0;
	pane.add(messages,c);
	
	for(ShipPart[] row : board.getBoard()){
	    for(ShipPart p : row){
		if(p==null){
		    JPanel empty = new JPanel();
		    empty.setPreferredSize(new Dimension(20,20));
		    empty.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		    empty.setBackground(Color.blue);
		    empty.addMouseListener(new emptyMouseListener());
		    board.add(empty);
		}
		else{
		    p.addMouseListener(new partMouseListener());
		    board.add(p);
		}
	    }
	}
    }

    public void actionPerformed(ActionEvent e){
	if (e.getSource() == newShip){
	    pane.remove(buildMainButtons);
	    c.weightx = 0.5;
	    c.gridx = 0;
	    c.gridy = 1;
	    pane.add(buildNewShipButtons,c);
	    messages.setText(shipBuildingModeMessage+"Enter the name of your ship. <br>");
	    pane.revalidate();
	    pane.repaint();
	    	         
	   }
	
	if (e.getSource() == enterName){
	    //System.out.println("recieved name: " + name.getText());
	    currentShip = new Ship(name.getText(), false);
	    pane.remove(buildNewShipButtons);
	    c.weightx = 0.5;
	    c.gridx = 0;
	    c.gridy = 1;
	    pane.add(buildMainButtons,c);
	    messages.setText(shipBuildingModeMessage+"Now Building \"" + currentShip + "\" <br>");
	    pane.revalidate();
	    pane.repaint();
	}
    }

    public static void main(String[] args){
	Gui g = new Gui();
	g.setVisible(true);
	g.shipBuildMode = true;
	if (g.shipBuildMode){
	    g.shipBuildingMode();
	}
    }
}

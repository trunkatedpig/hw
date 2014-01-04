import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Gui extends JFrame implements ActionListener{
    private Container pane;
    private GridBagConstraints c = new GridBagConstraints();
    private Container b;
    private Board board = new Board(10,10);
    private Ship currentShip = null;
    
    //determines stage of the game
    private boolean shipBuildMode = false;

    //buttons only used in certain stages
    private Container buildMainButtons;
    private Container buildNewShipButtons;
    private JButton newShip;
    private JTextField name;
    private JButton enterName;

    
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
	    System.out.println(e.getSource())
		;	}
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
	    System.out.println(e.getSource())
		;	}
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
	

	b = new Container();
	c.weightx = 0.5;
	c.gridx = 0;
	c.gridy = 0;
	b.setLayout(new GridLayout(10,10));
	pane.add(b,c);

        buildMainButtons = new Container();
	c.weightx = 0.5;
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
	
	for(ShipPart[] row : board.getBoard()){
	    for(ShipPart p : row){
		if(p==null){
		    JPanel empty = new JPanel();
		    empty.setPreferredSize(new Dimension(20,20));
		    empty.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		    empty.setBackground(Color.blue);
		    empty.addMouseListener(new emptyMouseListener());
		    b.add(empty);
		}
		else{
		    p.addMouseListener(new partMouseListener());
		    b.add(p);
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

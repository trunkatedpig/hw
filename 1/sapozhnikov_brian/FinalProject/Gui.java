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
    private Container buttons;
   
    
    //determines stage of the game
    private boolean shipBuildMode = false;

    //buttons only used in certain stages
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
	buttons.add(newShip);
	pane.update(this.getGraphics());
    }

    public void resetButtons(){
	buttons = new Container();
	c.gridx = 0;
	c.gridy = 1;
	buttons.setLayout(new FlowLayout());
	pane.add(buttons,c);
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
	c.gridx = 0;
	c.gridy = 0;
	b.setLayout(new GridLayout(10,10));
	pane.add(b,c);

        resetButtons();

	
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
	    buttons.removeAll();
	    //buttons.remove(newShip);
	    name = new JTextField(10);
	    name.addActionListener(this); //this line is probably not necessary
	    buttons.add(name);
	    /*
	    enterName = new JButton("Enter Name");
	    enterName.addActionListener(this);
	    buttons.add(enterName);
	    */
	    buttons.update(this.getGraphics());
	    //pane.remove(buttons);
	    //pane.add(buttons);
	    pane.update(this.getGraphics());
	    
	    
	}
	
	if (e.getSource() == enterName){
	    System.out.println("recieved name: " + name.getText());
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

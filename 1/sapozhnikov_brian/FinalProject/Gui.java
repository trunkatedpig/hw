import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Gui extends JFrame implements ActionListener{
    private Container pane;
    private Container b;
    private Board board = new Board(10,10);
    
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
    
    public Gui(){
	//format gui
	setTitle("Insert Awesome Title");
	setSize(600,400);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = this.getContentPane();
	pane.setLayout(new GridLayout(3,3));

	//instantiate
	b = new Container();

	//format instances
	b.setLayout(new GridLayout(10,10));

	//add to pane
	pane.add(b);
	
	for(ShipPart[] row : board.getBoard()){
	    for(ShipPart p : row){
		if(p==null){
		    JPanel empty = new JPanel();
		    empty.setPreferredSize(new Dimension(50,50));
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

    }

    public static void main(String[] args){
	Gui g = new Gui();
	g.setVisible(true);
    }
}

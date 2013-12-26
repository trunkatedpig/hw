import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Gui extends JFrame implements ActionListener{
    private Container pane;

    private class myKeyListener implements KeyListener {
	public void keyPressed(KeyEvent e){

	}
	public void keyReleased(KeyEvent e){

	}
	public void keyTyped(KeyEvent e){

	}
    }
    
    public Gui(){
	setTitle("Insert Awesome Title");
	setSize(600,400);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = this.getContentPane();
	pane.setLayout(new GridLayout(2,2));
	
    }

    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args){
	Gui g = new Gui();
	g.setVisible(true);
    }
}

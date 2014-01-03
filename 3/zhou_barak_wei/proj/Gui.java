import java.io.*;
import java.util.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*; 
import javax.imageio.*;

public class Gui implements ActionListener, MouseListener {
    private JFrame frame;
    private JLabel blackLabel;

    public Gui() {
	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,500);
	frame.setVisible(true);


	//black label to put in content pane
	blackLabel = new JLabel();
	blackLabel.setOpaque(true);
	blackLabel.setBackground(new Color(0, 0, 0));

	frame.getContentPane().add(blackLabel, BorderLayout.CENTER);
	
   }

   public static void main(String[] args) {
	Gui g = new Gui();
	
    }
    
}
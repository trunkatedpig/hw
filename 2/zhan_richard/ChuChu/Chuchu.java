import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Chuchu implements ActionListener{
    private JFrame frame;
    private JPanel canvas;
    private Container pane;
    private JLabel test;
    private boolean isGray=true;
    public void actionPerformed(ActionEvent e){
	System.out.println(e);
    }
    public Chuchu(){
	frame = new JFrame("CHUCHU ROCKETS!!!!");
	frame.setLayout(new GridLayout());
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	canvas = new JPanel();
	canvas.setLayout(new GridLayout(12,12));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	JPanel[][] tiles = new JPanel[12][12];
	for (JPanel[] k: tiles){
	    for(JPanel j:k){
		j=new JPanel();
		if (isGray==true)
		    j.setBackground(Color.lightGray);
		else
		    j.setBackground(Color.darkGray);
		canvas.add(j);
		System.out.println(j);
		isGray=!isGray;
	    }
	    isGray=!isGray;

	}
	System.out.println(canvas);
	System.out.println(tiles[3][5]);
	System.out.println("d");
	System.out.println(tiles[3][5].getX());
	Mouse a=new Mouse(tiles[3][5]);
	tiles[3][5].add(a);
	frame.add(canvas);
	frame.setSize(700,700);
	frame.setVisible(true);
    }
}

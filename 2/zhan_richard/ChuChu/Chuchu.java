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
    private JLabel test;
    public void actionPerformed(ActionEvent e){
	System.out.println(e);
    }
    public Chuchu(){
	frame = new JFrame("CHUCHU ROCKETS!!!!");
	frame.setLayout(new FlowLayout());
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	canvas = new JPanel();
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	test = new JLabel("Testing this function");
	canvas.add(test);
	frame.add(canvas);
	frame.setSize(700,700);
	frame.setVisible(true);
    }
}

import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener{
    private JButton attack;
    private JButton flee;
    private JPanel buttons;
    MainPlayer main;
    Character enemy;
    int test = 1;
    public Gui(){
	this.setTitle("Game");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	attack = new JButton("Attack");
	flee = new JButton("Flee");
	buttons = new JPanel();
	buttons.setLayout(new FlowLayout());
	buttons.add(attack);
	buttons.add(flee);
	flee.addActionListener(this);
	attack.addActionListener(this);
	this.setContentPane(buttons);
	this.setVisible(true);
    }

    public Gui(MainPlayer first, Character second){
	this.setTitle("Game");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	attack = new JButton("Attack");
	flee = new JButton("Flee");
	buttons = new JPanel();
	buttons.setLayout(new FlowLayout());
	buttons.add(attack);
	buttons.add(flee);
	flee.addActionListener(this);
	attack.addActionListener(this);
	this.setContentPane(buttons);
	this.setVisible(true);
	main = first; 
	enemy = second;
    }


    public void actionPerformed(ActionEvent e){
	if(e.getSource() == attack){
	    if (test == 1){
		test = main.meleeAttack(enemy);
		if (test == 1){
		    test = enemy.meleeAttack(main);
		}
	    }
	    if (test == -1){
		this.setVisible(false);
	    }
	}
	if(e.getSource() == flee){
	    System.out.println("Flee!!!");
	}
    }
    
    public MainPlayer getMainPlayer(){
	return main;
    }

    public Character getEnemy(){
	return enemy;
    }

    public int getTest(){
	return test;
    }

}

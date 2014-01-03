// import java.io.*;
// import java.util.*;

// public class Game{
//     MainPlayer player = new MainPlayer("Rushil");
//     Character c1 = new Character("David");
//     Gui g;
//     int test = 1;

//     public void battle(){
//     	g = new Gui(player,c1);
// 	test = 0;
// 	player = g.getMainPlayer();
// 	c1 = g.getEnemy();
// 	System.out.println(player.getHealth());
//     }

// }

import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.event.*;

public class Game extends JFrame implements ActionListener {
    private JButton attack;
    private JButton flee;
    private JPanel buttons;
    private JPanel box;
    private JLabel label;
    private int test = 1;
    MainPlayer player = new MainPlayer("Rushil"); 
    Character enemy = new Character("David");

    public Game(){
	this.setTitle("Game");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	attack = new JButton("Attack");
	attack.setPreferredSize(new Dimension(100,100));
	flee = new JButton("Flee");
	buttons = new JPanel();
	buttons.setLayout(new FlowLayout());
	buttons.add(attack);
	buttons.add(flee);
	box = new JPanel();
	label = new JLabel("Awesome");
      	// box.add(label);
	// buttons.add(box);
	buttons.add(label);
	flee.addActionListener(this);
	attack.addActionListener(this);
	this.setContentPane(buttons);
	this.setVisible(true);
    }

    // public Game(MainPlayer first, Character second){
    // 	this.setTitle("Game");
    // 	this.setSize(600,400);
    // 	this.setLocation(100,100);
    // 	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    // 	attack = new JButton("Attack");
    // 	flee = new JButton("Flee");
    // 	buttons = new JPanel();
    // 	buttons.setLayout(new FlowLayout());
    // 	buttons.add(attack);
    // 	buttons.add(flee);
    // 	flee.addActionListener(this);
    // 	attack.addActionListener(this);
    // 	this.setContentPane(buttons);
    // 	this.setVisible(true);
    // 	main = first; 
    // 	enemy = second;
    // }


    public void actionPerformed(ActionEvent e){
    	if(e.getSource() == attack){
    	    if (test == 1){
    		test = player.meleeAttack(enemy);
    		if (test == 1){
    		    test = enemy.meleeAttack(player);
    		}
    	    }
    	    if (test == -1){//this actually needs to be changed so that you dont have to hit attack again for the JFrame to close
		this.setVisible(false);
    	    }
    	}
    	if(e.getSource() == flee){
    	    System.out.println("Flee!!!");
    	}
    }

    public MainPlayer getPlayer(){
	return player;
    }

    public Character getEnemy(){
	return enemy;
    }

}






















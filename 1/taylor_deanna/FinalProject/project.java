import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class project extends JFrame implements ActionListener{

    private int money = 100;
    private int pigs = 0;
    private Container pane, one, two, three, four;
    private JFrame frame;
    private JButton exit, race, gts, buy, gtb, gtr, sell;
    private JPanel grid;
    private JLabel PanelOne, PanelTwo, PanelThree, PanelFour;
    private JTextField text;
    private boolean Shopping = false;
    private boolean Home = true;
    private boolean Racing = false;
    private Random r = new Random();

    private class myKeyListener implements KeyListener {
	public void keyPressed(KeyEvent e){
	}
	public void keyReleased(KeyEvent e){
	}
	public void keyTyped(KeyEvent e){
	}
    }

    public void actionPerformed(ActionEvent e){
	if (e.getSource() == exit){
	    System.exit(0);
	}
	else if (e.getSource() == gtr){
	    if (Racing){
		text.setText("Ummm, you're already at the races");
	    }
	    else {
		Racing = true;
		Shopping = false;
		Home = false;
		text.setText("You've arrived at the races");
	    }
	}
	else if (e.getSource() == race){
	    if (money >= 5){
		if (Racing){
		    int i = r.nextInt(5);
		    if (i == 1){
			money = money + 20;
			String s = "Your animal won the race";
			String t = "" + money;
			String a = s + " Now you have $" + t;
			text.setText(a);
		    }
		    else{
			money = money - 5;
			String s = "Darn, you lost the race!";
			String t = "" + money;
			String a = s + " Now you have $" + t;
			text.setText(a);
		    }
		}
		else {
		    text.setText("You've gotta head to the races first");
		}
	    }
	    else{
		text.setText("You don't have enough money to race");
	    }
	}
	else if (e.getSource() == sell){
	    if (Shopping){
		if (pigs > 0){
		    String s = "you sold a pig";
		    money = money + 5;
		    pigs = pigs - 1;
		    String p = "" + pigs;
		    String m = " You now have $" + money + " and " + pigs + " pigs.";
		    String a = s + m;
		    text.setText(a);
		}
		else {
		    text.setText("You ain't got any pigs to sell");
		}
	    }
	    else {
		text.setText("You have to be at the store to sell");
	    }
	}
	else if (e.getSource() == buy){
	    if (Shopping){ if (money > 5){
		    String s = "you bought a pig";
		    money = money - 5;
		    pigs = pigs + 1;
		    String p = "" + pigs;
		    String m = " You now have $" + money + " and " + pigs + " pigs.";
		    String a = s + m;
		    text.setText(a);
		}
		else {
		    text.setText("You dont have enough money, HA");
		}
	    }
	    else {
		text.setText("you have to go to the shop first");
	    }
	}
	else if (e.getSource() == gts){
	    if (!Shopping){
		Shopping = true;
		Racing = false;
		Home = false;
		String s = "You've arrived at the store";
		text.setText(s);
	    }
	    else {
		text.setText("You're already at the store you nub");
	    }
	}
	else if (e.getSource() == gtb){
	    if (!Home){
		Shopping = false;
		Home = true;
		Racing = false;
		text.setText("You've gone back to the barn");
	    }
	    else {
		text.setText("You're already home, silly!");
	    }
	}
	else {
	    String s = "you did something else";
	    text.setText(s);
	}
    }

    public project(){
	setTitle("Farmer Joe");
	setSize(600,400);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = this.getContentPane();
	pane.setLayout(new GridLayout(2,2));

	exit = new JButton("exit");
	buy = new JButton("buy a pig");
	gts = new JButton("go to the shop");
	gtb = new JButton("go home");
	gtr = new JButton("go to races");
	race = new JButton("enter a race");
	sell = new JButton("sell a pig");

	text = new JTextField();
	text.setEditable(false);

	grid = new JPanel();

	text.setBorder(BorderFactory.createLineBorder(Color.blue,2));
        text.addKeyListener(new myKeyListener());

	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(new GridLayout());

	PanelOne = new JLabel("Hi");

	buy.addActionListener(this);

	one = new Container();
	one.setLayout(new FlowLayout());
	pane.add(one);
	one.add(exit);
	one.add(gts);
	one.add(gtr);
	two = new Container();
	two.setLayout(new FlowLayout());
	pane.add(two);
	two.add(buy);
	two.add(sell);
	two.add(gtb);
	//two.add(gtr); /* Here: should we make a master panel of all buttons on the side or should we make it so that the go home button is at both the races and the shop? I like the idea of a master list of buttons but wasnt sure how to plan that. */
	pane.add(text);
	four = new Container();
	four.setLayout(new FlowLayout());
	pane.add(four);
	//four.add(gtb);
	//four.add(gts);
	four.add(race);
	exit.addActionListener(this);
	buy.addActionListener(this);
	gts.addActionListener(this);
	gtb.addActionListener(this);
	gtr.addActionListener(this);
	race.addActionListener(this);
	sell.addActionListener(this);

    }
	
    public static void main(String[] args) {
        project g = new project();
	g.setVisible(true);
    }
}


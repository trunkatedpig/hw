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
    private int charm = 0;
    private int cows = 1;
    private int horses = 0;
    private int fodder = 20;
    private int popularity = 0;
    private int raceswon = 0;
    private int timer = 0;
    private int milk = 0;
    private int pmilk = 0;
    private int pork = 0;
    private int beef = 0;
    private int fatness = 10;
    private int hunger = 0;
    private Container pane, one, two, three, four;
    private JFrame frame;
    private JButton exit, gts, gth, gtr, gtf, gtg, enter;
    private JPanel grid;
    private JLabel fnamelabel;
    private JTextField fnamefield;
    private JLabel PanelOne, PanelTwo, PanelThree, PanelFour;
    private JTextField text;
    private JTextArea stats;
    /*private CheckboxGroup animals;
      private Checkbox cow, pig, horse;*/
    private boolean Home = true;
    private boolean Racing = false;
    private boolean InFields = false;
    private boolean Shopping = false;
    private boolean atGov = false;
    private boolean horseKiller = false;
    private boolean buyingfood = false;
    private boolean sellingmeat = false;
    private boolean Rancher = false; //allows you to own horses
    private boolean mobster = false;
    private boolean buyinganimals = false;
    private Random r = new Random();


    private class myKeyListener implements KeyListener {
	public void keyPressed(KeyEvent e){
	}
	public void keyReleased(KeyEvent e){
	}
	public void keyTyped(KeyEvent e){
	}
    }


    public project(){
	setTitle("Farmer Joe");
	setSize(600,500);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	baseset();
    }
	
    public static void main(String[] args) {
        project g = new project();
	g.setVisible(true);
    }
    
    public void baseset(){
	pane = this.getContentPane();
	pane.setLayout(new GridLayout(2,2));

	exit = new JButton("exit");
	gts = new JButton("Go to the shop");
	gth = new JButton("Go home");
	gtr = new JButton("Go to the races");
	gtf = new JButton("Go to the fields");
	gtg = new JButton("Go to the gov office");
	enter = new JButton("Enter");

	/*animals = new CheckboxGroup();
	pig = new Checkbox("Pigs",animals,true);
	horse = new Checkbox("Horses",animals,false);
	cow = new Checkbox("Cows",animals,false);*/

	text = new JTextField();
	text.setEditable(false);
	stats = new JTextArea();
	stats.setEditable(false);

	grid = new JPanel();

	text.setBorder(BorderFactory.createLineBorder(Color.blue,2));
        text.addKeyListener(new myKeyListener());

	stats.setBorder(BorderFactory.createLineBorder(Color.blue,2));
        stats.addKeyListener(new myKeyListener());

	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(new GridLayout());

	PanelOne = new JLabel("Hi");

	one = new Container();
	one.setLayout(new FlowLayout());
	pane.add(one);
	one.add(exit);
	one.add(gth);
	one.add(enter);
	enter.setEnabled(false);
	two = new Container();
	two.setLayout(new FlowLayout());
	pane.add(two);
	two.add(gtr);
	two.add(gtf);
	two.add(gts);
	two.add(gtg);
	pane.add(text);
	pane.add(stats);

	fnamelabel=new JLabel("");
	fnamefield=new JTextField(5);
	fnamefield.setEditable(false);
       

	JPanel box = new JPanel();
	box.add(fnamelabel);
	box.add(fnamefield);

	pane.add(box);

	statify();

	exit.addActionListener(this);
	enter.addActionListener(this);
	gth.addActionListener(this);
	gts.addActionListener(this);
	gtf.addActionListener(this);
	gtr.addActionListener(this);
	gtg.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
	timer = timer + 1;
	pmilk = pmilk + 2*cows;
	hunger = hunger + 1;
	fatness = fatness - 1;
	if ((fatness < 0) && ((cows > 0) || (pigs > 0) || (horses > 0))){
	    cows = 0;
	    pigs = 0;
	    horses = 0;
	    text.setText("Animals died of hunger");
	}
	else{
	    hunger = 0;
	    fatness = 0;
	}
	statify();
	if (e.getSource() == exit){
	    System.exit(0);
	}

	else if(e.getSource() == enter){
	    if (buyingfood){
		String x = fnamefield.getText();
		int a = Integer.parseInt(x);
		if (money > a){
		    money = money - a;
		    fodder = fodder + a;
		}
		else{
		    text.setText("Insufficient funds");
		}
	    }
	    else if(sellingmeat){
		String x = fnamefield.getText();
		if ((x.equals("Pig")) || (x.equals("Pigs"))  || (x.equals("pigs")) || (x.equals("pig")) || (x.equals("pork")) || (x.equals("Pork"))){
			money = money + (pork * 2);
			pork = 0;
		    }
		else if ((x.equals("Cow")) || (x.equals("Cows"))  || (x.equals("cows")) || (x.equals("cow")) || (x.equals("beef")) || (x.equals("Beef"))){
		    money = money + (beef * 3);
		    beef = 0;
		}
		else {
		    text.setText("Invalid input");
		}
	    }
	    else if(buyinganimals){
		String x = fnamefield.getText();
		if ((x.equals("Pig")) || (x.equals("Pigs"))  || (x.equals("pigs")) || (x.equals("pig"))){
		    if (money > 15){
			pigs = pigs + 1;
			money = money - 15;
		    }
		    else{
			text.setText("insufficient funds");
		    }
		}
		else if ((x.equals("Cow")) || (x.equals("Cows"))  || (x.equals("cows")) || (x.equals("cow"))){
		    if (money > 30){
			cows = cows + 1;
			money = money - 30;
		    }
		    else{
			text.setText("insufficient funds");
		    }
		}
		else if ((x.equals("Horse")) || (x.equals("Horses"))  || (x.equals("horses")) || (x.equals("horse"))){
		    if (!Rancher){
			text.setText("You are not a rancher");
		    }
		    else if (money > 50){
			horses = horses + 1;
			money = money - 50;
		    }
		    else {
			text.setText("insufficient funds");
		    }
		}
		else {
		    text.setText("Invalid input");
		}
	    }
	}
	
	else if(e.getSource() == gth){
	    
	    if(Home){
		text.setText("Already home.");
	    }
	    
	    else{
		gtf.setEnabled(true);
		gtr.setEnabled(true);
		gts.setEnabled(true);
		gtg.setEnabled(true);
		gtr.setText("Go to the races");
		gtf.setText("Go to the fields");
		gts.setText("Go to the shop");
		gtg.setText("Go to government");
		Home = true;
		Shopping = false;
		Racing = false;
		InFields = false;
		atGov = false;
		text.setText("Welcome home honey");

	    }
	}
	
	else if (e.getSource() == gtr){

	    if(Home){
		
		gtr.setText("Bet");
		gtf.setText("Enter race");
		gts.setText("Join mob");
		gtg.setText("Throw party");
		Home = false;
		Shopping = false;
		Racing = true;
		InFields = false;
		atGov = false;
		text.setText("Welcome to the races, boy");
		if (!Rancher){
		    gtf.setEnabled(false);
		}

	    }

	    if(Racing){
		
	        // THIS IS THE FUNCTION TO BET ON A RACE

	    }

	    if (InFields){

		// FEED DIFFERENT ANIMAL TYPES USING FEED VARIABLE
		if (fodder < cows + pigs){
		    text.setText("Not enough fodder, needs " +  (cows + pigs - fodder) + " more");
		}
		else{
		    while ((fodder > cows + pigs) && (hunger > 0)){
			fodder = fodder - 1;
			hunger = hunger - 1;
			fatness = fatness + 1;
		}

		}}

	    if (Shopping){

		// NOW YOU BUY FODDER
		buyingfood = true;
		fnamelabel.setText("Input ammount");
		fnamefield.setEditable(true);
		enter.setEnabled(true);
		text.setText(fnamefield.getText());

	    }

	    
	    if (atGov){
		// becoming a rancher
		if ((money > 300) && (charm > 10)){
		    Rancher = true;
		    money = money - 300;
		}

		else{

		    if (money < 300)
			text.setText("You don't have sufficient money");
		    else{
			text.setText("You aren't charming enough");
		    }

		}
	    }
	}

	else if (e.getSource() == gtf){

	    if(Home){
		// going to the fields
		gtr.setText("Feed");
		gtf.setText("Milk");
		gts.setText("Slaughter");
		gtg.setText("Train");
		if(!Rancher)
		    gtg.setEnabled(false);
		if((cows + pigs + horses) <= 1){
		    gts.setEnabled(false);
		}
		Home = false;
		Shopping = false;
		Racing = false;
		InFields = true;
		atGov = false;
		text.setText("Ain't the fields beautiful");

	    }

	    if(Racing){
		
	        /* if you have horses, then you can enter. I think it should be a game. If 0 horses, can't enter */

	    }

	    if (InFields){

	        milk = milk + pmilk;
		pmilk = 0;

	    }

	    if (Shopping){

		// Buy animals
		buyinganimals = true;
		fnamelabel.setText("Type 'Pig' 'Horse' or 'Cow'");
		fnamefield.setEditable(true);
		enter.setEnabled(true);
		text.setText(fnamefield.getText());

	    }

	    
	    if (atGov){
		//visiting the mob
		if (mobster){
		    
		    gtr.setText("Buy politician");
		    gtf.setText("Rob bank");
		    gts.setText("Throw a race");
		    gtg.setText("Eat Pasta");
		    Home = false;
		    Shopping = false;
		    Racing = false;
		    InFields = false;
		    atGov = false;
		    text.setText("Bookadee Bapa");

		    // this stuff has to be added

		}

		else{

		    text.setText("Don't come near us again, this time you will come off with only ten dollars out of your pocket");
		    money = money - 10;

		}
		
	    }

	}

	else if (e.getSource() == gts){

	    if(Home){
		
		gtr.setText("Buy food");
		gtf.setText("Buy animals");
		gts.setText("Sell meat");
		gtg.setText("Sell milk");
		Home = false;
		Shopping = true;
		Racing = false;
		InFields = false;
		atGov = false;
		text.setText("Welcome to the finest general stores on this side of the Mississippi");

	    }

	    if(Racing){
		
	        //Join mob
		if ((charm > 15) && (r.nextInt(5) > 1)){
		    mobster = true;
		    text.setText("You are now a mobster. Visit the government offices to see more");
		}

		else{

		    money = money - 100;
		    text.setText("You got caught. You have been released on $100 bail.");
		}

	    }

	    if (InFields){

		// Slaughter
		if (pigs > 0){
		    pigs = pigs - 1;
		    pork = pork + fatness;
		}

		else if (cows > 0){
		    cows = cows - 1;
		    beef = beef + fatness * 2;
		}
		else if (horses > 0){
		    horses = horses - 1;
		    beef = beef + fatness;
		}

	    }

	    if (Shopping){

		// sell meat
		// we can add fluctuating meat prices
		sellingmeat = true;
		fnamelabel.setText("Type 'Pork' or 'Beef'");
		fnamefield.setEditable(true);
		enter.setEnabled(true);
		text.setText(fnamefield.getText());

		

	    }

	    
	    if (atGov){
		// pay taxes
	        popularity = popularity + 20;
		money = money - (money / 10);
		charm = charm + 2;
		
	    }

	}


	else if (e.getSource() == gtg){

	    if(Home){
		
		gtr.setText("Apply for horseing liscense");
		gtf.setText("Visit mob");
		gts.setText("Pay taxes");
		gtg.setText("Run for office");
		Home = false;
		Shopping = false;
		Racing = false;
		InFields = false;
		atGov = true;
		text.setText("Welcome to the Western government offices");
		if(!mobster){
		    gtf.setEnabled(false);
		}
	    }

	    if(Racing){
		
	        // throw a party
		if (money > 100){
		    money = money - 100;
		    charm = charm + 4;
		    popularity = popularity + 20;
		}

		else{
		    text.setText("Insufficient funds");
		}

	    }

	    if (InFields){

		// train

	    }

	    if (Shopping){

		// Sell milk
		// sells at 1 dollar per gallon, we can have fluctuating milk prices
		money = money + milk;
		milk = 0;
		statify();

	    }

	    
	    if (atGov){

		// running for office

		if (popularity > 100){
		    if (charm > 30){
			if ((mobster) || (charm > 80)){
			    text.setText("Congratulations, you are now a congressman");
			}
			else{
			    text.setText("The mob crushed your campaign.");
			}
		    }
		    else{
			text.setText("You weren't polished enough");
		    }
		}
		else{

		    text.setText("Not enough people like you");

		}
	    }

	}
	statify();
    }

    public void statify(){

	String s = "Money: " + money + " \nCharm: " + charm +  "\nPopularity: " + popularity + "\nFodder: " + fodder + "\nCows: " + cows + "\nPigs: " + pigs + "\nHorses: " + horses + "\nRaces won: " + raceswon + "\nBeef: " + beef + "\nPork: " + pork + "\nMilk: " + milk + "\nHunger: " + hunger;
	stats.setText(s);
    }


}

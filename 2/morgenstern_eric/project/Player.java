import java.io.*;
import java.util.*;

public class Player {
    public boolean canMovea1;
    public boolean canMovea2;
    public boolean canMovea3;
    public boolean canMovea4;
    public String name;
    public int[] a1;
    public int[] a2;
    public int[] a3;
    public int[] a4;
    public Player(String n){
	name=n;
	a1 = new int[2];
	a2 = new int[2];
	a3 = new int[2];
	a4 = new int[2];
	canMovea1=false;
	canMovea2=false;
	canMovea3=false;
	canMovea4=false;
    }
    public void turn(){
	//executes a turn of a single player
	int r = roll();
	setCanMoves();
	evaluateAndExecuteChoices(r);
    }
    public boolean didIWin(){
	return true;
	//checks to see if the player has won
    }
    public boolean kill(){
	return true;
	//determines if a piece needs to be killed
    }
    public int roll(){
	Random r = new Random();
	return r.nextInt(6)+1;
    }
    public void setCanMoves(){
	if(
    }
    public void evaluateAndExecuteChoices(int r){
	//find possible choices
	//evaluate the answers to see if they can be done
	//prints possible choices
	//takes scanner input and checks to see if possible
	//executes choice, moves selected piece
	if (canMovea1)
	    System.out.println("Option 1: Move piece one "+r+" spaces");
	else if ((a1[0]==1000)&&(r==6))
	    System.out.println("Option 1: Activate piece one");
	else
	    System.out.println("Option 1: Unavailable");
	if (canMovea2)
	    System.out.println("Option 2: Move piece one "+r+" spaces");
	else if ((a2[0]==1000)&&(r==6))
	    System.out.println("Option 2: Activate piece one");
	else
	    System.out.println("Option 2: Unavailable");
	if (canMovea3)
	    System.out.println("Option 3: Move piece one "+r+" spaces");
	else if ((a3[0]==1000)&&(r==6))
	    System.out.println("Option 3: Activate piece one");
	else
	    System.out.println("Option 3: Unavailable");
	if (canMovea4)
	    System.out.println("Option 4: Move piece one "+r+" spaces");
	else if ((a4[0]==1000)&&(r==6))
	    System.out.println("Option 4: Activate piece one");
	else
	    System.out.println("Option 4: Unavailable");
    }
}

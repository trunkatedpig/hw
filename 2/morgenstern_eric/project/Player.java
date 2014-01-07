import java.io.*;
import java.util.*;

public class Player {
    public boolean canMovea1;
    public boolean canMovea2;
    public boolean canMovea3;
    public boolean canMovea4;
    public void turn(){
	//executes a turn of a single player
	int r = roll();
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
    public void evaluateAndExecuteChoices(int r){
	//find possible choices
	//evaluate the answers to see if they can be done
	//prints possible choices
	//takes scanner input and checks to see if possible
	//executes choice, moves selected piece
	if (canMovea1)
	    System.out.println("Option 1: Move piece one "+r+" spaces");
	else if ((getXcor==1000)&&(r==6))
	    System.out.println("Option 1: Activate piece one");
	else{
	    System.out.println("This option is unavailable. Try again");
	    evaluateAndExecuteChoices(r);
	}
    }
}

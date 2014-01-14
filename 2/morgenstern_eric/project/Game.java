import java.io.*;
import java.util.*;

public class Game {
    //Who's playing?
    public Player AA;
    public Player BB;

    // Used to determine who's turn it is. Implement in scoreboard.
    //Even is Player AA. Odd is Player BB.
    public int count=0;

    //For visual use only
    public char[][] board=new char[11][11];

    //This will stop method play
    public boolean keepGoing=true;

    public Game(Player aa, Player bb){
	AA=aa;
	BB=bb;}

    public String play(){
	//check if this is valid	
	int[] moved=new int[2];
	if (keepgoing){
	    if ((count%2)==0){
		moved=AA.turn();
		//kill by deleting
		//print scoreboard
		count+=1;
		//did anybody win method
	    }
	    else{
		moved=BB.turn();
		count+=1;}
	}
	return "winner is";
	    //plays the game using count and the turn method in player
    }
    
    public static void main(Strings[] args){
	Player aa=new Player("Eric");
	Player bb=new Player("Michael");
	Game first=new Game(aa,bb);

}

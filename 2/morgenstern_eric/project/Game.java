import java.io.*;
import java.util.*;

public class Game {
    public int count;
    public char[][] board;
    public boolean keepGoing;
    public String winner;
    public Game(){
	board = new char[10][10];
	winner = "";
	count = 1;
	keepGoing = true;
    }
    public String play(Pilot a, Pilot b){
	return "hi";
	//plays the game using count and the turn method in player
    }
}

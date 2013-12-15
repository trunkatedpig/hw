import java.util.*;
import java.io.*;

public class WordSearch {
    private char[][] board;
    private ArrayList<String> w,wordsUsed;
    

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++) {
		board[i][j]='-';
	    }
	}
	w = loadList();
	wordsUsed = new ArrayList<String>();
    }

    public WordSearch() {
	this(20,20);
    }

    public ArrayList<String> loadList()
    {
	ArrayList<String> words = new ArrayList<String>();
	try{
	    Scanner s = new Scanner(new File("WordList.txt"));
	    while(s.hasNext()){
		words.add(s.next());
	    }
	}
	catch(Exception e){
	    e.printStackTrace();
	}
	return words;
    }


    public String toString() {
	String s="";
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		s=s+board[i][j];
	    }
	    s=s+"\n";
	}
	return s;
    }

    public boolean add(int dx, int dy, int x, int y, String word){
	int xl, yl;
	xl = x + dx * word.length() -dx;
	yl = y + dy * word.length() - dy;

	    if(
	       x >= 0 && xl < board[0].length&&
	       y >= 0 && yl < board.length&&
	       xl >= 0 && x < board[0].length&&
	       yl >= 0 && y < board.length)
			  
			    
		{
		    for(int i = 0; i < word.length(); i++){
			    if(word.charAt(i) != board[dy*i + y][x + dx*i] && board[i*dy + y][x + dx*i] != '-'){
				return false;
				}

		    }
		    for(int i = 0; i < word.length(); i++){
			    board[y + i*dy][x + i*dx] = word.charAt(i);
			    }
		    return true;
		}
	    return false;
    }

    public void addWords(int num){
	Random r = new Random();
	for(int i = 0; i < num; i++){
		if(w.size() < 1)
			return;
		String temp = w.remove(r.nextInt(w.size()));
		if(placeWord(temp))
			wordsUsed.add(temp);
	}
    }

    public ArrayList<String> getWordsUsed(){
	    return wordsUsed;
    }


    public boolean placeWord(String word){
	Random r = new Random();
	int dx, dy;
	do{
		dx = r.nextInt(3) - 1;
		dy = r.nextInt(3) - 1;
	}
	while(dx == 0 && dy == 0);
	int x = r.nextInt(board[0].length);
	int y = r.nextInt(board.length);
	for( int i = 0; i < 10; i ++){
	    if(add(dx, dy, x, y, word)){
		    return true;
	    }
	}
	return false;
    }

    
}


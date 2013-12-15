import java.io.*;
import java.util.*;

public class WordSearch{
    /*Worked in class with Caspar; used some of the code he wrote outside of class;
      used some of the code we wrote as a whole class; and I edited some of the code;*/

    Random R = new Random();
    
    private ArrayList<String> wordList;
    public ArrayList<String> usedWords = new ArrayList<String>();
    private char[][] board;
    private int rows;
    private int columns;
    
    public WordSearch(int r, int c) {
	rows = r;
	columns = c;
        board = new char[r][c];
        for (int i=0;i<r;i++) 
            for (int j=0;j<c;j++) 
                board[i][j]='-';
	readWords("Instruments.txt");
    }

    public WordSearch() {
        this(20,20);
    }

    public String toString() {
        String s = "";
        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board[i].length;j++) {
                s=s+board[i][j];
            }
            s=s+"\n";
        }
        return s;
    }

    private void readWords(String filename){
        wordList = new ArrayList<String>();
        try{
            Scanner sc = new Scanner(new File(filename));
            while(sc.hasNext()){
                String s = sc.nextLine();
                wordList.add(s);
            }
        }catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }

public boolean AddWord (int r, int c, int dx, int dy, String word){
        //  AddWord (int r, int c, int dx, int dy, String word)
        // dx: 1 for right, -1 for left, 0 for stationary
        // dy: 1 for down, -1 for up, 0 for stationary
               
        if (dx == 0 && dy == 0){
            //System.out.println("dx and dy cannot both equal zero");
            return false; //this would mean that the word was not 
                          //sprouting in any direction. 
                          //Only the first letter would render.
        }
        if (dx > 1 || dx < -1 || dy > 1 || dy < -1){
            System.out.println("dx and dy must both be within range.");
            return false;
        }
        int i = 0;
        
        //dx: "X-Direction" --  (-1) for Left, (1) for Right, (0) for neither;
        //dy: "Y-Direction" -- ditto;
                
        try{
            while (i < word.length()){
                if (board[r + (dy*i)][c + (dx*i)] != '-' 
                    && board[r + (dy*i)][c + (dx*i)] != word.charAt(i))
                    return false;
                i++;
            }
        }
        catch (Exception e){
            return false;
        }
        
        i = 0;
        while (i < word.length()){
            board[r + (dy*i)][c + (dx*i)] = word.charAt(i);
            i++;
        }
        return true;
    }

     public void FillIn(){
        for (int x = 0; x < rows; x++)
            for (int y = 0; y < columns; y++)
                if (board[x][y] == '-')
                    board[x][y] = (char)(R.nextInt(26) + 'A');
    } 

    public boolean RandWords(){
        for (int i = 0; i < wordList.size(); i ++){
	    int place = R.nextInt(wordList.size());
	    String word = wordList.get(place);
            int dx = R.nextInt(3)-1;
            int dy = R.nextInt(3)-1;
            int c = R.nextInt(columns);
            int r = R.nextInt(rows);
            if ((AddWord (r, c, dx, dy, word))){
                usedWords.add(word);
		wordList.remove(place);
            }
	    else{
		dx = R.nextInt(3)-1;
		dy = R.nextInt(3)-1;
		c = R.nextInt(columns);
		r = R.nextInt(rows);
		if ((AddWord (r, c, dx, dy, word))){
		    usedWords.add(word);
		    wordList.remove(place);
		}
		else{
		    dx = R.nextInt(3)-1;
		    dy = R.nextInt(3)-1;
		    c = R.nextInt(columns);
		    r = R.nextInt(rows);
		    if ((AddWord (r, c, dx, dy, word))){
			usedWords.add(word);
			wordList.remove(place);
		    }
		}
	    }
		
		
	}
        return true;
    }

   
	    
}

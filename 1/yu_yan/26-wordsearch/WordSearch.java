import java.util.*;
import java.io.*;

public class WordSearch{

    private char[][] board;
    private ArrayList<String> wordList, wordBank;
    private int rows, cols;

    public WordSearch(int rows, int cols) {
        board = new char[rows][cols];
        for (int i=0;i<rows;i++) 
            for (int j=0;j<cols;j++) 
                board[i][j]='-';
        this.rows = rows;
        this.cols = cols;
	fillWordList("words.txt");
    }

    private void fillWordList(String s){
	wordList = new ArrayList<String>();
	try{
	    Scanner sc = new Scanner(new File(s));
	    while (sc.hasNext()){
		String str = sc.nextLine();
		wordList.add(str);
	    }
	}catch(FileNotFoundException e){
	    System.out.println("We could not find the file");
	    System.exit(0);
	}catch(Exception e){
	    System.out.println(e);
	    System.exit(0);
	}
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

    public void test(WordSearch w){
        System.out.println(w);
	System.out.println(wordBank);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
    }

    //Insertion methods

    private boolean insert(int c, int r, int cinc, int rinc, String s){
	if (r > rows-1 || r < 0 || c > cols-1 || c < 0)
	    return false;
        //diagonal check
        if (rinc == 1 && cinc == 1){
            if (r + s.length()-1 > rows || c + s.length()-1 > cols)
                return false;
	}

	//reverse diagonal check
	else if (rinc == -1 && cinc == -1){
	    if (r - s.length()-1 < 0 || c - s.length()-1 < 0)
		return false;
	}
        //vert check
        else if (rinc == 1 && cinc == 0){
            if (r + s.length()-1 > rows || c>cols-1)
                return false;
        }
        //horizontal check
        else if (cinc == 1 && rinc == 0){
            if (c + s.length()-1 > cols || r>rows-1)
                return false;
        }

        for (int n=0; n<s.length(); n++){
            if ( (board[r + rinc*n][c + cinc*n] != '-') &&
                 (board[r + rinc*n][c + cinc*n] != s.charAt(n))){
		return false;
            }
        }

        for (int n=0; n<s.length(); n++){
            board[r + rinc*n][c + cinc*n] = s.charAt(n);
	}
	return true;
    }

    public boolean insertHorizontal(int c, int r, String s){
	return insert(c, r, 1, 0, s);
    }
    
    public boolean insertVertical(int c, int r, String s){
	return insert(c, r, 0, 1, s);
    }

    public boolean insertDiagonal1(int c, int r, String s){
	//top left to bottom right
	return insert(c, r, 1, 1, s);
    }
    
    public boolean insertDiagonal2(int c, int r, String s){
	//bottom left to top right
	return insert(c, r, -1, -1, s);
    }

    private String reverse(String s){
	String s1 = "";
	for (int n=s.length(); n>0; n--){
	    s1 = s1 + s.substring(n-1, n);
	}
	return s1;
    }

    public boolean insertHReverse(int c, int r, String s){
	return insertHorizontal(c, r, reverse(s));
    }

    public boolean insertVReverse(int c, int r, String s){
	return insertVertical(c, r, reverse(s));
    }
    
    public boolean insertD1Reverse(int c, int r, String s){
	return insertDiagonal1(c, r, reverse(s));
    }

    public boolean insertD2Reverse(int c, int r, String s){
	return insertDiagonal2(c, r, reverse(s));
    }
   
    private void fillWordBank(int n){
	wordBank = new ArrayList<String>();
	//*tries* to add n words to the wordsearch
	Random r = new Random();
	while (!(wordList.isEmpty()) && n>0){
	    int i = r.nextInt(wordList.size());
	    String w = wordList.get(i);
	    try{if (addWords(w)){
		    wordBank.add(w);
		    n = n-1;
		}
		wordList.remove(i);
	    } catch (Exception e) {}
	}
    }
    
    private boolean addWords(String s){
	Random r = new Random();
	for (int z=0; z<100; z++){
	    int n = r.nextInt(8);
	    if (n==0)
		if(insertHorizontal(r.nextInt(cols), r.nextInt(rows), s))
		    return true;
	    if (n==1)
		if(insertVertical(r.nextInt(cols), r.nextInt(rows), s))
		    return true;
	    if (n==2)
		if(insertDiagonal1(r.nextInt(cols), r.nextInt(rows), s))
		    return true;
	    if (n==3)
		if(insertDiagonal2(r.nextInt(cols), r.nextInt(rows), s))
		    return true;
	    if (n==4)
		if (insertHReverse(r.nextInt(cols), r.nextInt(rows), s))
		    return true;
	    if (n==5)
	        if (insertVReverse(r.nextInt(cols), r.nextInt(rows), s))
		    return true;
	    if (n==6)
		if(insertD1Reverse(r.nextInt(cols), r.nextInt(rows), s))
		    return true;
	    if (n==7)
	        if (insertD2Reverse(r.nextInt(cols), r.nextInt(rows), s))
		    return true;
	}
	return false;
    }	    

    private void fillIn(){
	Random r = new Random();
	for (int n=0; n<cols; n++){
	    for (int m=0; m<rows; m++){
		if (board[m][n] == '-')
		    board[m][n] = (char)('a' + r.nextInt(26));
	    }
	}
    }

    public void game(int n){
	fillWordBank(n);
	fillIn();
	test(this);
    }
    public void game(){
	game(10);
    }
}

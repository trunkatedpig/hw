import java.io.*;
import java.util.*;
public class WordSearch {

    private char[][] board;
    private Random r = new Random();
    private int attempts= 5;
    private ArrayList<String> toAdd = new ArrayList<String>();
    private ArrayList<String> added = new ArrayList<String>();
    private char[][] preAdd;


    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) 
	    for (int j=0;j<cols;j++) 
		board[i][j]='-';
    }

    public WordSearch() {
	this(20,20);
    }
    public void getWords(String file) {
	try {
	    File f = new File(file);
	    Scanner sc= new Scanner(f);
	    while (sc.hasNext()==true) {
		String s=sc.nextLine();
		if (s.length()>2) {
		    toAdd.add(s.toLowerCase());
		} 
	    }
	} catch (FileNotFoundException e) {
	    System.out.println("file not found error");
	    System.exit(0);
		}
    }

    public boolean addWordRandom(String word){
	int z= r.nextInt(8);
	int row= r.nextInt(board.length);
	int c= r.nextInt(board[row].length);
	if (z==0) {
	    return addWordVU(row,c,word);
	}
	else if (z==1) {
	    return addWordVD(row,c,word);
	}
	else if (z==2) {
	    return addWordH(row,c,word);
	}
	else if (z==3) {
	    return addWordHB(row,c,word);
	}
	else if (z==4) {
	    return addWordDRD(row,c,word);
	}
	else if (z==5) {
	    return addWordDRU(row,c,word);
	}
	else if (z==6) {
            return addWordDLD(row,c,word);
        }
	else {
            return addWordDLU(row,c,word);
	}	
    }
    
    public void addWordFF() {
	int p= r.nextInt(toAdd.size());
	String j = toAdd.get(p);
	for (int q=0; q<attempts; q++) {
	    if (addWordRandom(toAdd.get(p))==true) {
		toAdd.remove(p);
		added.add(j);
		break;
	    }
	}
    }
    
    public void makeSearch(int num) {
	for (int q=0; q<num; q++) {
	    addWordFF();
	}
	fill();
	System.out.println(beforeFill());
	System.out.println(added);
	System.out.println(this);
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
    public String beforeFill() {
        String s = "";
        for (int i=0;i<preAdd.length;i++) {
            for (int j=0;j<preAdd[i].length;j++) {
                s=s+preAdd[i][j];
            }
            s=s+"\n";
        }
        return s;
    }

    public char[][] copy(char[][] array){
	char[][]start = new char[array.length][array[0].length];
	for (int i=0;i<array.length;i++) 
	    for (int j=0;j<array[0].length;j++) 
		start[i][j]=array[i][j];
	return start;
    }
    public String toBoard(char[][] arr) {
	String s = "";
	for (int i=0;i<arr.length;i++) {
	    for (int j=0;j<arr[i].length;j++) {
		s=s+arr[i][j];
	    }
	    s=s+"\n";
	}
	return s;
    }

    public boolean addWordH(int r, int c, String word) {
        char[][] temp=copy(board); 
	if ( c + word.length() > temp.length ){
	    // System.out.println("first return");
	    return false;
	}
	if ( r<0 || c<0 || c>board[0].length || r>board.length) {
	    //  System.out.println("second return");
	    return false;
	}
	for (int index=0; index < word.length() ; index++ ) {
	    //    System.out.println("temp\n"+ toBoard(temp));
	    //   System.out.println("board\n"+toBoard(temp));
	    if (temp[r][index+c]==('-')){
		temp[r][index+c]=word.charAt(index);
	    }
	    else if(temp[r][index+c]==(word.charAt(index))) {
		
	    }
	    else {
		System.out.println("here");
		return false; 
	    }
	}
	board=temp;
	return true;
       

    }
 public boolean addWordHB(int r, int c, String word) {
        char[][] temp=copy(board); 
	if ( r - word.length() < 0)
	    return false;
	if ( r<0 || c<0 || c>board[0].length || r>board.length) 
	    return false;
	
	for (int index=0; index < word.length() ; index++ ) {
	    if (temp[r][c-index]==('-')){
		temp[r][c-index]=word.charAt(index);
	    }
	    else if(temp[r][c-index]==(word.charAt(index))) {
		
	    }
	    else {
		return false; 
	    }
	}
	board=temp;
	return true;
	

    }
    public boolean addWordVD(int r, int c, String word) {
        char[][] temp=copy(board); 
	if ( r + word.length() > board.length )
	    return false;
	if ( r<0 || c<0 || c>board[0].length || r>board.length) 
	    return false;
	
	for (int index=0; index < word.length() ; index++ ) {
	    if (temp[r+index][c]==('-')){
		temp[r+index][c]=word.charAt(index);
	    }
	    else if(temp[r+index][c]==(word.charAt(index))) {
		
	    }
	    else {
		return false; 
	    }
	}
	board=temp;
	return true;
	

    }
    public boolean addWordVU(int r, int c, String word) {
        char[][] temp=copy(board); 
	if ( r -  word.length() <= 0 ) {
	    System.out.println("here");
	    return false;
	}
	if ( r<0 || c<0 || c>board[0].length || r>board.length) 
	    return false;
	for (int index=0; index < word.length() ; index++ ) {
	    if (temp[r-index][c]==('-')){
		temp[r-index][c]=word.charAt(index);
	    }
	    else if(temp[r-index][c]==(word.charAt(index))) {
		
	    }
	    else {
		return false; 
	    }
	}
	board=temp;
	return true;
	

    }
    public boolean addWordDRD(int r, int c, String word) {
        char[][] temp=copy(board); 
	if ( r + word.length() > board.length || c+word.length() > board[0].length )
	    return false;
	if ( r<0 || c<0 || c>board[0].length || r>board.length) 
	    return false;
	
	for (int index=0; index < word.length() ; index++ ) {
	    if (temp[r+index][c+index]==('-')){
		temp[r+index][c+index]=word.charAt(index);
	    }
	    else if(temp[r+index][c+index]==(word.charAt(index))) {
		
	    }
	    else {
		return false; 
	    }
	}
	board=temp;
	return true;
	

    }
    public boolean addWordDLD(int r, int c, String word) {
        char[][] temp=copy(board); 
	if ( r + word.length() > board.length || c - word.length() < 0 )
	    return false;
	if ( r<0 || c<0 || c>board[0].length || r>board.length) 
	    return false;
	
	for (int index=0; index < word.length() ; index++ ) {
	    if (temp[r+index][c-index]==('-')){
		temp[r+index][c-index]=word.charAt(index);
	    }
	    else if(temp[r+index][c-index]==(word.charAt(index))) {
		
	    }
	    else {
		return false; 
	    }
	}
	board=temp;
	return true;
	

    }   
    public boolean addWordDLU(int r, int c, String word) {
        char[][] temp=copy(board); 
	if (  r - word.length() < 0 || c - word.length() < 0 )
	    return false;
	if ( r<0 || c<0 || c>board[0].length || r>board.length) 
	    return false;
	
	for (int index=0; index < word.length() ; index++ ) {
	    if (temp[r-index][c-index]==('-')){
		temp[r-index][c-index]=word.charAt(index);
	    }
	    else if(temp[r-index][c-index]==(word.charAt(index))) {
		
	    }
	    else {
		return false; 
	    }
	}
	board=temp;
	return true;
	

    }   
    public boolean addWordDRU(int r, int c, String word) {
        char[][] temp=copy(board); 
	if ( r - word.length() < 0 || c+word.length() > board[0].length )
	    return false;
  	if ( r<0 || c<0 || c>board[0].length || r>board.length) 
	    return false;
	
	for (int index=0; index < word.length() ; index++ ) {
	    if (temp[r-index][c+index]==('-')){
		temp[r-index][c+index]=word.charAt(index);
	    }
	    else if(temp[r-index][c+index]==(word.charAt(index))) {
		
	    }
	    else {
		return false; 
	    }
	}
	board=temp;
	return true;
	

    }
    public void fill() {
	preAdd=copy(board);
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		if (board[i][j]=='-') {
		    board[i][j]=getChar();
		}
	    }
	}
    }
    public char getChar() {
	String alpha = "qwertyuioplkjhgfdsazxcvbnm";
	Random r = new Random();
	int index= r.nextInt(26);
	return alpha.charAt(index);
	
    }

}

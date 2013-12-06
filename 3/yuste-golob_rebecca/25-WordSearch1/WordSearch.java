import java.util.*;

public class WordSearch {
    private char[][] board;
    
    public WordSearch(int rows, int cols) {
        board = new char[rows][cols];
        for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++) {
                board[i][j]='-';
	    }
        }
    }
    
    public WordSearch() {
        this(20,20);
    }
    
    public boolean addWordH(int row, int col, String word) {
	
        for (int i=0;i<word.length();i++) {
	    try {
                // int j = 10/0; // <-- only here to show ArithmeticException
                if (board[row][col+i]!='-' && board[row][col+i]!=word.charAt(i))
		    return false;
		
	    } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Got ArrayIndex thing: "+e);
                return false;
	    } catch (ArithmeticException e) {
                System.out.println("Got the math thing: "+e);
                return false;
	    } catch (Exception e) {
                System.out.println("Last case, generic exception: "+e);
                return false;
	    }
	    
	    
	    
        }
	
        for (int i=0;i<word.length();i++) {
	    board[row][col+i]=word.charAt(i);
        }
	
        return true;
    }

 public boolean addWordBackH(int row, int col, String word) {
	
        for (int i=0;i<word.length();i++) {
	    try {
                // int j = 10/0; // <-- only here to show ArithmeticException
                if (board[row][col+i]!='-' && board[row][col+i]!=word.charAt(i))
		    return false;
		
	    } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Got ArrayIndex thing: "+e);
                return false;
	    } catch (ArithmeticException e) {
                System.out.println("Got the math thing: "+e);
                return false;
	    } catch (Exception e) {
                System.out.println("Last case, generic exception: "+e);
                return false;
	    }
	    
	    
	    
        }
	
        for (int i=0;i<word.length();i++) {
	    board[row][col+i]=word.charAt(word.length()-1-i);
        }
	
        return true;
    }
    

    
public boolean addWordV(int row, int col, String word) {
	
        for (int i=0;i<word.length();i++) {
	    try {
                // int j = 10/0; // <-- only here to show ArithmeticException
                if (board[row+i][col]!='-' && board[row+i][col]!=word.charAt(i))
		    return false;
		
	    } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Got ArrayIndex thing: "+e);
                return false;
	    } catch (ArithmeticException e) {
                System.out.println("Got the math thing: "+e);
                return false;
	    } catch (Exception e) {
                System.out.println("Last case, generic exception: "+e);
                return false;
	    }  
        }
	
        for (int i=0;i<word.length();i++) {
	    board[row+i][col]=word.charAt(i);
        }
	
        return true;
    }
    

    public boolean addWordBackV(int row, int col, String word) {
	
        for (int i=0;i<word.length();i++) {
	    try {
                // int j = 10/0; // <-- only here to show ArithmeticException
                if (board[row+i][col]!='-' && board[row+i][col]!=word.charAt(i))
		    return false;
		
	    } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Got ArrayIndex thing: "+e);
                return false;
	    } catch (ArithmeticException e) {
                System.out.println("Got the math thing: "+e);
                return false;
	    } catch (Exception e) {
                System.out.println("Last case, generic exception: "+e);
                return false;
	    }  
        }
	
        for (int i=0;i<word.length();i++) {
	    board[row+i][col]=word.charAt(word.length()-1-i);
        }
	
        return true;
    }

public boolean addWordD(int row, int col, String word) {
	
        for (int i=0;i<word.length();i++) {
	    try {
                // int j = 10/0; // <-- only here to show ArithmeticException
                if (board[row+i][col+i]!='-' && board[row+i][col+i]!=word.charAt(i))
		    return false;
		
	    } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Got ArrayIndex thing: "+e);
                return false;
	    } catch (ArithmeticException e) {
                System.out.println("Got the math thing: "+e);
                return false;
	    } catch (Exception e) {
                System.out.println("Last case, generic exception: "+e);
                return false;
	    }  
        }
	
        for (int i=0;i<word.length();i++) {
	    board[row+i][col+i]=word.charAt(i);
        }
	
        return true;
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
    
    
}
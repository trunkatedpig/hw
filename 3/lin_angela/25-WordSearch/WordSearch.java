import java.util.*;

public class WordSearch {
    private char[][] board;
    private int r, c;

    public WordSearch(int rows, int cols) {
        board = new char[rows][cols];
	r= rows; //also board.length
	c = cols;
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                board[i][j]='-';
            }
        }

    }

    public WordSearch() {
        this(20,20);
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


    public boolean addWordH(int row, int col, String word) {
	int l = word.length();
	if (row > r || row < 0 || r-row<l || col < 0 || col>c)
	    return false;
	else {
        for (int i=0;i<l;i++) {
            try {
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
    
    }

    public boolean addWordV(int row, int col, String word) {
	int l = word.length();
	if (row > r || row < 0 || r-row<l || col<0 || col>c)
	    return false;
	else {
        for (int i=0;i<l;i++) {
            try {
                if (board[row +i][col]!='-' && board[row+i][col]!=word.charAt(i))
                    return false;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Got ArrayIndex thing: "+e);
                return false;
 
            } catch (Exception e) {
                System.out.println("Generic exception: "+e);
                return false;
            }
        }
        for (int i=0;i<word.length();i++) {
            board[row+i][col]=word.charAt(i);
        }
        return true;
	}
    
    }
        
}

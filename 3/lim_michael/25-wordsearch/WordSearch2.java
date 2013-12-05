import java.util.*;

public class WordSearch2 {
    private int rows, cols;
    private char[][] board;

    public WordSearch2(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++) {
		board[i][j]='-';
	    }
	}
	this.rows = rows;
	this.cols = cols;
    }

    public WordSearch2() {
	this(20,20);
    }
    
    public boolean addWord(int row, int col, String word, int x){
	/* int x indicates which position you want to insert the word in
	   1 = Horizontal Forward
	   2 = Right Upward
	   3 = Right Downward
	   4 = Horizontal Backward
	   5 = Left Upward
	   6 = Left Downward
	   7 = Vertical Upward
	   8 = Vertical Downward
	*/
	int length = 0;
	int width = 0;
	int nlength = 0;
	int nwidth = 0;
	int n = 0;
	int m = 0;

	if(x==1){
	    int length = word.length();
	    int width = 0;
	    int nlength = 0;
	    int nwidth = 0;
	    int n = 0;
	    int m = 1;
	}

	if(x==2){
	    int length = word.length();
	    int width = 0;
	    int nlength = 0;
	    int nwidth = -1 * word.length();
	    int n = -1;
	    int m = 1;   
	}

	if(x==3){
	    int length = word.length();
	    int width = word.length();
	    int nlength = 0;
	    int nwidth = 0;
	    int n = 1;
	    int m = 1;
	}

	if(x==4){
       	    int length = 0;
	    int width = 0;
	    int nlength = -1 * word.length();
	    int nwidth = 0;
	    int n = 0;
	    int m = -1;
	}

	if(x==5){
	    int length = 0;
	    int width = 0;
	    int nlength = -1 * word.length();
	    int nwidth = -1 * word.length();
	    int n = -1;
	    int m = -1;
	}

	if(x==6){
	    int length = 0;
	    int width = word.length();
	    int nlength = -1 * word.length();
	    int nwidth = 0;
	    int n = 1;
	    int m = -1;
	}

	if(x==7){
	    int length = 0;
	    int width = 0;
	    int nlength = 0;
	    int nwidth = -1 * word.length();
	    int n = -1;
	    int m = 0;
	}

	else{
	    int length = 0;
	    int width = word.length();
	    int nlength = 0;
	    int nwidth = 0;
	    int n = 1;
	    int m = 0;
	}

	if(row+nlength<0||col+width>cols||col+nwidth<0||row+length>rows){
	    return false;
	}
	
	int i = 0;
	int j = 0;
	int k = 0;
	while(k<word.length()){
	    if(board[row+i][col+j] != '-'&& board[row+i][col+j] != word.charAt(k)){
		return false;
	    }
	    i = i + n;
	    j = j + m;
	    k = k + 1;
	}
	
	i = 0;
	j = 0;
	k = 0;
	while(k<word.length()){
	    board[row+i][col+j] = word.charAt(k);
	    i = i + n;
	    j = j + m;
	    k = k + 1;
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

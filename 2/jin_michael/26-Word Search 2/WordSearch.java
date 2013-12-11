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

    public boolean addWordH(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();

	if (row<0 || col<0 || row>rowmax)
	    return false;
	if (colmax<wmax+col)
	    return false;

	for (int ww=0;ww<wmax;ww++){
	    int colf=col+ww;
	    char w=board[row][colf];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}

	for (int ww=0;ww<wmax;ww++){
	    int colf=col+ww;
	    board[row][colf]=word.charAt(ww);
	}
	return true;
    }

    public boolean addWordHB(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();

	if (row<0 || col>colmax || row>rowmax)
	    return false;
	if (-1>col-wmax)
	    return false;

	for (int ww=0;ww<wmax;ww++){
	    int colf=col-ww;
	    char w=board[row][colf];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}

	for (int ww=0;ww<wmax;ww++){
	    int colf=col-ww;
	    board[row][colf]=word.charAt(ww);
	}
	return true;
    }

    public boolean addWordVB(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();

	if (row<0 || col<0 || col>colmax)
	    return false;
	if (-1>row-wmax)
	    return false;

	for (int ww=0;ww<wmax;ww++){
	    int rowf=row-ww;
	    char w=board[rowf][col];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}

	for (int ww=0;ww<wmax;ww++){
	    int rowf=row-ww;
	    board[rowf][col]=word.charAt(ww);
	}
	return true;
    }

 public boolean addWordV(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();

	if (row<0 || col<0 || col>colmax)
	    return false;
	if (rowmax<wmax+row)
	    return false;

	for (int ww=0;ww<wmax;ww++){
	    int rowf=row+ww;
	    char w=board[rowf][col];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}

	for (int ww=0;ww<wmax;ww++){
	    int rowf=row+ww;
	    board[rowf][col]=word.charAt(ww);
	}
	return true;
    }

public boolean addWordDBR(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();

	if (row<0 || col<0)
	    return false;
	if (rowmax<wmax+row || colmax<wmax+col)
	    return false;

	for (int ww=0;ww<wmax;ww++){
	    int rowf=row+ww;
	    int colf=col+ww;

	    char w=board[rowf][colf];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}

	for (int ww=0;ww<wmax;ww++){
	    int rowf=row+ww;
	    int colf=col+ww;
	    board[rowf][colf]=word.charAt(ww);
	}
	return true;
    }
    
    public boolean addWordDBL(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();
	
	if (row<0 || col<0)
	    return false;
	if (rowmax<wmax+row || -1>col-wmax)
	    return false;
	
	for (int ww=0;ww<wmax;ww++){
	    int rowf=row+ww;
	    int colf=col-ww;
	    
	    char w=board[rowf][colf];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}
	
	for (int ww=0;ww<wmax;ww++){
	    int rowf=row+ww;
	    int colf=col-ww;
	    board[rowf][colf]=word.charAt(ww);
	}
	return true;
    }

    public boolean addWordDTL(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();
	
	if (row<0 || col<0)
	    return false;
	if (-1>row-wmax || -1>col-wmax)
	    return false;
	
	for (int ww=0;ww<wmax;ww++){
	    int rowf=row-ww;
	    int colf=col-ww;
	    
	    char w=board[rowf][colf];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}
	
	for (int ww=0;ww<wmax;ww++){
	    int rowf=row-ww;
	    int colf=col-ww;
	    board[rowf][colf]=word.charAt(ww);
	}
	return true;
    }

public boolean addWordDTR(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();
	
	if (row<0 || col<0)
	    return false;
	if (-1>row-wmax || colmax<col+wmax)
	    return false;
	
	for (int ww=0;ww<wmax;ww++){
	    int rowf=row-ww;
	    int colf=col+ww;
	    
	    char w=board[rowf][colf];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}
	
	for (int ww=0;ww<wmax;ww++){
	    int rowf=row-ww;
	    int colf=col+ww;
	    board[rowf][colf]=word.charAt(ww);
	}
	return true;
    }

    public void randomL(){
	int rowmax=board.length;
	int colmax=board[0].length;

	String al="abcdefghijklmnopqrstuvwxyz";
	Random r=new Random();
	
	for (int i=0;i<rowmax;i++){
	    for (int j=0;j<colmax;j++){
		if (board[i][j]=='-'){
			int rr=r.nextInt(26);
			char rrr=al.charAt(rr);
			board[i][j]=rrr;}
	    }
	}
    }
}

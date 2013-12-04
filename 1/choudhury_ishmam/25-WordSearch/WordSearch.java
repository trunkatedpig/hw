public class WordSearch{

    private char[][] board;
    public int cols;
    public int rows;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	cols = cols;
	rows = rows;
	for (int i=0;i<rows;i++) 
	    for (int j=0;j<cols;j++) 
		board[i][j]='-';
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

    public boolean InsertWordH(int r, int c, String s){
	
	// check if any spaces have existing characters
	for (int i = 0; i < s.length(); i++){
	    int x = c;
	    if (!(board[r][x] == ('-')))
		if (!(board[r][x] == (s.charAt(i))))
		    return false;
	    c++;
	    if (c > cols)
		return false;
	    System.out.println('x');
	}
	for (int j = 0; j < s.length(); j++){
	    board[r][c+j] = s.charAt(j);
	}
	return true;
    }

}

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

    public void addHorizontal(int y, int x, String word){
            if(
                            x >= 0 &&
                            x + word.length() <= board.length &&
                            y >= 0 &&
                            y < board[0].length
                ){
                    for(int i = 0; i < word.length(); i++){
                            if(word.charAt(i) != board[i + x][y] && board[i + x][y] != '-'){
                                    return;
                            }
                    }
                    for(int i = 0; i < word.length(); i++){
                            board[x + i][y] = word.charAt(i);
                    }
                }
    }
}

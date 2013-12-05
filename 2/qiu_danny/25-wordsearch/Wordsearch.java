import java.util.*;

public class Wordsearch {

    private char[][] grid;

    public Wordsearch(int rows, int columns) {
        grid = new char[rows][columns];
        for (int r=0; r<rows; r++) {
            for (int c=0; c<columns; c++) {
                grid[r][c] = '-';
            }
        }
    }

    public Wordsearch() {
        this(20, 20);
    }

    private char[][] createTmpGrid() {
        char[][] tmpGrid = new char[grid.length][grid[0].length];
        for (int x=0; x<tmpGrid.length; x++) {
            for (int y=0; y<tmpGrid[x].length; y++) {
                tmpGrid[x][y] = grid[x][y];
            }
        }
        return tmpGrid;
    }

    public boolean addWord(int row, int column, String word) {
        char[][] tmpGrid = createTmpGrid();
        if (row < 0 || column < 0 || row > grid.length || column > grid[row].length) {
            System.out.println("Out of range");
            return false;
        }
        else if (word.length() + column > grid[row].length) {
            System.out.println("The word is too long!");
            return false;
        }
        for (int i=0; i<word.length(); i++) {
            if ((tmpGrid[row][column+i] != '-') && (tmpGrid[row][column+i] != word.charAt(i))) {
                return false;}
            tmpGrid[row][column+i] = word.charAt(i);
        }
        grid = tmpGrid;
        return true;
    }

    public boolean addWordDown(int row, int column, String word) {
        char[][] tmpGrid = createTmpGrid();
        if (row < 0 || column < 0 || row > grid.length || column > grid[row].length) {
            System.out.println("Out of range");
            return false;
        }
        else if (word.length() + row > grid.length) {
            System.out.println("The word is too long!");
            return false;
        }
        for (int i=0; i<word.length(); i++) {
            if ((tmpGrid[row+i][column] != '-') && (tmpGrid[row+i][column] != word.charAt(i)))
                return false;
            tmpGrid[row+i][column] = word.charAt(i);
        }
        grid = tmpGrid;
        return true;
    }

    public boolean addWordDiagonal(int row, int column, String word) {
        char[][] tmpGrid = createTmpGrid();
        if (row < 0 || column < 0 || row > grid.length || column > grid[row].length) {
            System.out.println("Out of range");
            return false;
        }
        else if (word.length() + column > grid[row].length || word.length() + row > grid.length) {
            System.out.println("The word is too long!");
            return false;
        }
        for (int i=0; i<word.length(); i++) {
            if ((tmpGrid[row+i][column+i] != '-') && (tmpGrid[row+i][column+i] != word.charAt(i)))
                return false;
            tmpGrid[row+i][column+i] = word.charAt(i);
        }
        grid = tmpGrid;
        return true;
    }

    public String toString() {
        String s = "";
        for (int r=0; r<grid.length; r++) {
            s += "\n";
            for (int c=0; c<grid[r].length; c++) {
                s += grid[r][c];
            }
        }
        return s;
    }
}

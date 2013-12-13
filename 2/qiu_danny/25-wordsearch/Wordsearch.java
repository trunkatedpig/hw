import java.util.*;
import java.io.*;

public class Wordsearch {

    private char[][] grid;
    Random rand = new Random();
    private ArrayList<String> words = new ArrayList<String>();

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

    public void importWordList(String filename) {
        try {
            File f = new File(filename);
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                String s = sc.nextLine();
                if (s.length() > 1) {
                    words.add(s.toLowerCase());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            System.exit(0);
        }
    }

    public void addWordList() {
        ArrayList<String> find = new ArrayList<String>();
        for (int i=0; i<words.size(); i++) {
            // To allow most of the wordlist to be used
            if (Math.random() < .002) {
                if (addRandom(words.get(i))) {
                    find.add(words.get(i));
                }
            }
        }
        System.out.println(find);
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

    private boolean addWord(int row, int column, int dR, int dC, String word) {
        char[][] tmpGrid = createTmpGrid();
        if (row < 0 || column < 0 || row > grid.length || column > grid[row].length) {
            System.out.println("Out of range");
            return false;
        }
        if (dR < -1 || dR > 1 || dC < -1 || dC > 1 || (dR == 0 && dC == 0)) {
            return false;
        }
        int r = row, c = column;
        for (int i = 0; i < word.length(); i++) {
            try {
                if ((tmpGrid[r][c] != '-') && (tmpGrid[r][c] != word.charAt(i))) {
                    return false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                return false;
            }
            tmpGrid[r][c] = word.charAt(i);
            r += dR;
            c += dC;
        }
        grid = tmpGrid;
        return true;
    }

    public boolean addWordH(int row, int column, String word) {
        return addWord(row, column, 0, 1, word);
    }

    public boolean addWordHR(int row, int column, String word) {
        return addWord(row, column, 0, -1, word);
    }

    public boolean addWordV(int row, int column, String word) {
        return addWord(row, column, 1, 0, word);
    }

    public boolean addWordVR(int row, int column, String word) {
        return addWord(row, column, -1, 0, word);
    }

    public boolean addWordNE(int row, int column, String word) {
        return addWord(row, column, -1, 1, word);
    }

    public boolean addWordNER(int row, int column, String word) {
        return addWord(row, column, 1, -1, word);
    }

    public boolean addWordNW(int row, int column, String word) {
        return addWord(row, column, -1, -1, word);
    }

    public boolean addWordNWR(int row, int column, String word) {
        return addWord(row, column, 1, 1, word);
    }

    public boolean addWordSE(int row, int column, String word) {
        return addWord(row, column, 1, 1, word);
    }

    public boolean addWordSER(int row, int column, String word) {
        return addWord(row, column, -1, -1, word);
    }

    public boolean addWordSW(int row, int column, String word) {
        return addWord(row, column, 1, -1, word);
    }

    public boolean addWordSWR(int row, int column, String word) {
        return addWord(row, column, -1, 1, word);
    }

    public boolean addRandom(String word) {
        int r = rand.nextInt(grid.length);
        int c = rand.nextInt(grid[r].length);
        int dR = rand.nextInt(3) - 1;
        int dC = rand.nextInt(3) - 1;
        return addWord(r, c, dR, dC, word);
    }

    public void fillRand() {
        for (int r=0; r<grid.length; r++) {
            for (int c=0; c<grid[r].length; c++) {
                if (grid[r][c] == '-') {
                    grid[r][c] = (char)('a' + rand.nextInt('z' - 'a'));
                }
            }
        }
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

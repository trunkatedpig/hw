import java.util.*;

public class WordSearch {
	private char[][] grid;
	private Random random = new Random();
	
	public WordSearch() {grid = new char[0][0];}
	public WordSearch(int width, int height) {
		if ((width < 0) || (height < 0)) {throw new IllegalArgumentException("WordSearch(int width, int height) -> width and height must be non-negative");}
		grid = new char[width][height];
		for (int i = 0; i < grid.length; i++) {Arrays.fill(grid[i], '-');}
	}
	public WordSearch(WordSearch ws) {this.grid = ws.toArray();} //Copy
	public WordSearch(WordSearch ws, int width, int height) {
		if ((width < 0) || (height < 0)) {throw new IllegalArgumentException("WordSearch(WordSearch ws, int width, int height) -> width and height must be non-negative");}
		for (int x = 0; x < Math.min(grid.length, ws.toArray().length); x++) {
			grid[x] = Arrays.copyOfRange(ws.toArray()[x], 0, width);
			for (int y = ws.toArray()[0].length; y < grid[0].length; y++) {grid[x][y] = '-';} //Forwent the Arrays.fill() method
		}
	}
	
	public boolean addWord(String word) {return addWord(random.nextInt(grid.length), random.nextInt(grid[0].length), random.nextInt(8) + 1, word);}
	public boolean addWord(int orientation, String word) {return addWord(random.nextInt(grid.length), random.nextInt(grid[0].length), orientation, word);}
	public boolean addWord(int x, int y, String word) {return addWord(x, y, random.nextInt(8) + 1, word);}
	public boolean addWord(int x, int y, int orientation, String word) {
		if (((x < 0) || (x > grid.length - 1)) && ((y < 0) || (y > grid[0].length - 1))) {
			System.out.println("ArrayIndexOutOfBounds: x = " + x + ", y = " + y);
			return false;
		}
		if ((x < 0) || (x > grid.length - 1)) {
			System.out.println("ArrayIndexOutOfBounds: x = " + x);
			return false;
		}
		if ((y < 0) || (y > grid[0].length - 1)) {
			System.out.println("ArrayIndexOutOfBounds: y = " + y);
			return false;
		}
		if ((orientation < 0) || (orientation > 8)) {
			System.out.println("IllegalArgument: Orientation must be [0, 8] (0-Random, 1-Horizontal, 2-Horizontal reversed, 3-Vertical, 4-Vertical reversed, 5-Diagonal left, 6-Diagonal left reversed, 7-Diagonal right, 8-Diagonal right reversed)");
			return false;
		}
		if (word.length() == 0) {return true;}
		word = word.toUpperCase();
		if (!(word.matches("[A-Z_]*"))) {
			System.out.println("IllegalArgument: Word must only contain letters A-Z, a-z and underscores");
			return false;
		}
		
		String wordReversed = "";
		for (int i = word.length() - 1; i >= 0; i--) {wordReversed += word.charAt(i);}
		//This can be done using a switch statement
		if (orientation == 0) {orientation = random.nextInt(8) + 1;}
		if (orientation == 1) {
			if (x + word.length() - 1 > grid.length - 1) {return false;}
			for (int i = 0; i < word.length(); i++) {if ((grid[x + i][y] != '-') && (grid[x + i][y] != word.charAt(i))) {return false;}}
			for (int i = 0; i < word.length(); i++) {grid[x + i][y] = word.charAt(i);}
			return true;
		}	
		if (orientation == 2) {return addWord(x - word.length() + 1, y, 1, wordReversed);}
		if (orientation == 3) {
			if (y + word.length() - 1 > grid.length - 1) {return false;}
			for (int i = 0; i < word.length(); i++) {if ((grid[x][y + i] != '-') && (grid[x][y + i] != word.charAt(i))) {return false;}}
			for (int i = 0; i < word.length(); i++) {grid[x][y + i] = word.charAt(i);}
			return true;
		}
		if (orientation == 4) {return addWord(x, y - word.length() + 1, 3, wordReversed);}
		if (orientation == 5) {
			if ((x - word.length() < 0) || (y + word.length() - 1 > grid.length - 1)) {return false;}
			for (int i = 0; i < word.length(); i++) {if ((grid[x - i][y + i] != '-') && (grid[x - i][y + i] != word.charAt(i))) {return false;}}
			for (int i = 0; i < word.length(); i++) {grid[x - i][y + i] = word.charAt(i);}
			return true;
		}
		if (orientation == 6) {return addWord(x + word.length() - 1, y - word.length() + 1, 5, wordReversed);}
		if (orientation == 7) {
			if ((x + word.length() - 1 > grid.length - 1) || (y + word.length() - 1 > grid.length - 1)) {return false;}
			for (int i = 0; i < word.length(); i++) {if ((grid[x + i][y + i] != '-') && (grid[x + i][y + i] != word.charAt(i))) {return false;}}
			for (int i = 0; i < word.length(); i++) {grid[x + i][y + i] = word.charAt(i);}
			return true;
		}
		if (orientation == 8) {return addWord(x - word.length() + 1, y - word.length() + 1, 7, wordReversed);}
		
		return true;
	}
	
	public boolean addWordHorizontal(int x, int y, String word) {return addWord(x, y, 1, word);}
	public boolean addWordHorizontalReversed(int x, int y, String word) {return addWord(x, y, 2, word);}
	public boolean addWordVertical(int x, int y, String word) {return addWord(x, y, 3, word);}
	public boolean addWordVerticalReversed(int x, int y, String word) {return addWord(x, y, 4, word);}
	public boolean addWordDiagonalLeft(int x, int y, String word) {return addWord(x, y, 5, word);}
	public boolean addWordDiagonalLeftReversed(int x, int y, String word) {return addWord(x, y, 6, word);}
	public boolean addWordDiagonalRight(int x, int y, String word) {return addWord(x, y, 7, word);}
	public boolean addWordDiagonalRightReversed(int x, int y, String word) {return addWord(x, y, 8, word);}
		
	public void fillGrid() {for (int y = 0; y < grid[0].length; y++) {for (int x = 0; x < grid.length; x++) {if (grid[x][y] == '-') {grid[x][y] = (char) ('A' + random.nextInt(26));}}}}
	public int getHeight() {return grid[0].length;}
	public int getWidth() {return grid.length;}
	
	public char[][] toArray() {return grid;}
	public String toString() {
		String s = "";
		for (int y = 0; y < grid[0].length; y++) {
			for (int x = 0; x < grid.length; x++) {s += grid[x][y] + " ";}
			s = s.trim() + "\n";
		}
		
		return s.trim();
	}
}

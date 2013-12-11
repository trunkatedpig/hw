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
	
	public boolean addWord(String word) {return addWord(word, 100);}
	public boolean addWord(String word, int retries) {
		for (int i = 0; i < retries; i++) {if (addWord(random.nextInt(grid.length), random.nextInt(grid[0].length), random.nextInt(8) + 1, word)) {return true;}}
		
		return false;
	}
	public boolean addWord(int orientation, String word) {return addWord(orientation, word, 100);}
	public boolean addWord(int orientation, String word, int retries) {
		for (int i = 0; i < retries; i++) {if (addWord(random.nextInt(grid.length), random.nextInt(grid[0].length), orientation, word)) {return true;}}
		
		return false;
	}
	public boolean addWord(int x, int y, String word) {
		boolean[] orientations = new boolean[8];
		Arrays.fill(orientations, false);
		int orientation = random.nextInt(8) + 1;
		while (!(orientations[1] && orientations[2] && orientations[3] && orientations[4] && orientations[5] && orientations[6] && orientations[7] && orientations[8])) {//Index 0 goes unused
			while (orientations[orientation]) {orientation = random.nextInt(8) + 1;}
			orientations[orientation] = true;
			if (addWord(x, y, orientation, word)) {return true;}
		}
		
		return false;
	}
	//The master addWord method:
	public boolean addWord(int x, int y, int orientation, String word) {
		word = word.toUpperCase();
		if ((x < 0) || (x > grid.length - 1) || (y < 0) || (y > grid.length - 1) || (orientation < 0) || (orientation > 8) || !(word.matches("[A-Z_]*"))) {return false;}
		
		byte xOffset = 0, yOffset = 0;
		if (orientation == 0) {orientation = random.nextInt(8) + 1;}
		if (orientation == 1) {xOffset = 1; yOffset = 0;}
		if (orientation == 2) {xOffset = -1; yOffset = 0;}
		if (orientation == 3) {xOffset = 0; yOffset = 1;}
		if (orientation == 4) {xOffset = 0; yOffset = -1;}
		if (orientation == 5) {xOffset = -1; yOffset = 1;}
		if (orientation == 6) {xOffset = 1; yOffset = -1;}
		if (orientation == 7) {xOffset = 1; yOffset = 1;}
		if (orientation == 8) {xOffset = -1; yOffset = -1;}
		
		for (int i = 0; i < word.length(); i++) {if ((x + (i * xOffset) < 0) || (x + (i * xOffset) > grid.length - 1) || (y + (i * yOffset) < 0) || (y + (i * yOffset) > grid[0].length - 1) || ((grid[x + (i * xOffset)][y + (i * yOffset)] != '-') && (grid[x + (i * xOffset)][y + (i * yOffset)] != word.charAt(i)))) {return false;}}
		for (int i = 0; i < word.length(); i++) {grid[x + (i * xOffset)][y + (i * yOffset)] = word.charAt(i);}
		
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
		
	public void fillRandom() {for (int y = 0; y < grid[0].length; y++) {for (int x = 0; x < grid.length; x++) {if (grid[x][y] == '-') {grid[x][y] = (char) ('A' + random.nextInt(26));}}}}
	
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

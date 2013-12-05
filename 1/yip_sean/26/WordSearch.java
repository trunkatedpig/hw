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
	public WordSearch(WordSearch puzzle) {this.grid = puzzle.toArray();} //Copy
	public WordSearch(WordSearch puzzle, int width, int height) {
		if ((width < 0) || (height < 0)) {throw new IllegalArgumentException("WordSearch(WordSearch puzzle, int width, int height) -> width and height must be non-negative");}
		for (int x = 0; x < Math.min(grid.length, puzzle.toArray().length); x++) {
			grid[x] = Arrays.copyOfRange(puzzle.toArray()[x], 0, width);
			for (int y = puzzle.toArray()[0].length; y < grid[0].length; y++) {grid[x][y] = '-';} //Forwent the Arrays.fill() method
		}
	}
	
	public boolean addWord(String word) {
		if (addWord(random.nextInt(grid.length), random.nextInt(grid[0].length), random.nextInt(6) + 1, word)) {return true;}
		
		return false;
	}
	
	public boolean addWord(int orientation, String word) {
		if (addWord(random.nextInt(grid.length), random.nextInt(grid[0].length), orientation, word)) {return true;}
		
		return false;
	}
	
	public boolean addWord(int x, int y, String word) {
		if (addWord(x, y, random.nextInt(6) + 1, word)) {return true;}
		
		return false;
	}
	
	public boolean addWord(int x, int y, int orientation, String word) {
		if ((x < 0) || (x > grid.length - 1)) {throw new ArrayIndexOutOfBoundsException("x = " + x);}
		if ((y < 0) || (y > grid[0].length - 1)) {throw new ArrayIndexOutOfBoundsException("y = " + y);}
		if ((orientation < 0) || (orientation > 8)) {
			System.out.println("addWord(int x, int y, int orientation, String word) -> orientation x must be 0 <= x <= 6 (0-Random, 1-Horizontal, 2-Horizontal reversed, 3-Vertical, 4-Vertical reversed, 5-Diagonal left, 6-Diagonal left reversed, 7-Diagonal right, 8-Diagonal right reversed)");
			return false;
		}
		if (word.length() == 0) {return true;}
		word = word.toUpperCase();
		if (!(word.matches("[A-Z_]*"))) {
			System.out.println("addWord(int x, int y, int orientation, String word) -> word must only contains letters A-Z, a-z and underscores");
			return false;
		}
		
		if (orientation == 0) {orientation = random.nextInt(6) + 1;}
		String wordReversed = "";
		for (int i = word.length() - 1; i >= 0; i--) {wordReversed += word.charAt(i);}
		switch (orientation) {
			case 1:
				if (x + word.length() - 1 > grid.length - 1) {return false;}
				for (int i = 0; i < word.length(); i++) {if ((grid[x + i][y] != '-') && (grid[x + i][y] != word.charAt(i))) {return false;}}
				
				for (int i = 0; i < word.length(); i++) {grid[x + i][y] = word.charAt(i);}
				
				return true;
			
			case 2:
				return addWord(x - word.length() + 1, y, 1, wordReversed);
			
			case 3:
				if (y + word.length() - 1 > grid.length - 1) {return false;}
				for (int i = 0; i < word.length(); i++) {if ((grid[x][y + i] != '-') && (grid[x][y + i] != word.charAt(i))) {return false;}}
				
				for (int i = 0; i < word.length(); i++) {grid[x][y + i] = word.charAt(i);}
				
				return true;
			
			case 4:
				return addWord(x, y - word.length() + 1, 3, wordReversed);
				
			case 5:
				if ((x - word.length() < 0) || (y + word.length() - 1 > grid.length - 1)) {return false;}
				for (int i = 0; i < word.length(); i++) {if ((grid[x - i][y + i] != '-') && (grid[x - i][y + i] != word.charAt(i))) {return false;}}
				
				for (int i = 0; i < word.length(); i++) {grid[x - i][y + i] = word.charAt(i);}
				
				return true;
			
			case 6:
				return addWord(x + word.length() - 1, y - word.length() + 1, 5, wordReversed);
			
			case 7:
				if ((x + word.length() - 1 > grid.length - 1) || (y + word.length() - 1 > grid.length - 1)) {return false;}
				for (int i = 0; i < word.length(); i++) {if ((grid[x + i][y + i] != '-') && (grid[x + i][y + i] != word.charAt(i))) {return false;}}
				
				for (int i = 0; i < word.length(); i++) {grid[x + i][y + i] = word.charAt(i);}
				
				return true;
			case 8:
				return addWord(x - word.length() + 1, y - word.length() + 1, 7, wordReversed);
			default:
				System.out.println("Unimplemented");
				return false;
		}
	}
	
	public boolean addWordHorizontal(int x, int y, String word) {return addWord(x, y, 1, word);}
	
	public boolean addWordVertical(int x, int y, String word) {return addWord(x, y, 3, word);}
		
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

import java.util.*;

public class WordSearch {
	private char[][] grid;
	private Random random = new Random();
	
	public WordSearch() {grid = new char[0][0];}
	public WordSearch(int width, int height) {
		grid = new char[width][height];
		for (int i = 0; i < grid.length; i++) {Arrays.fill(grid[i], '-');}
	}
	public WordSearch(WordSearch puzzle) {this.grid = puzzle.toArray();} //Copy
	public WordSearch(WordSearch puzzle, int width, int height) {
		this(width, height);
		for (int x = 0; x < Math.min(grid.length, puzzle.toArray().length); x++) {
			grid[x] = Arrays.copyOfRange(puzzle.toArray()[x], 0, width);
			for (int y = puzzle.toArray()[0].length; y < grid[0].length; y++) {grid[x][y] = '-';}
		}
	}
	
	public boolean addWordHorizontal(String word) {
		if (addWordHorizontal(word, 1000)) {return true;}
		
		return false;
	}
	public boolean addWordHorizontal(String word, int retries) {
		word = word.toUpperCase();
		if ((!(word(word))) || (retries <= 0)) {return false;}
		
		for (int i = 0; i < retries; i++) {if (addWordHorizontal(random.nextInt(grid.length), random.nextInt(grid[0].length), word)) {return true;}}
		
		return false;
	}
	public boolean addWordHorizontal(int x, int y, String word) {
		word = word.toUpperCase();
		if ((x < 0) || (x > grid.length - 1) || (y < 0) || (y > grid[0].length - 1) || (!(word(word))) || (x + word.length() - 1 > grid.length)) {return false;}
		for (int i = 0; i < word.length(); i++) {if (((grid[x + i][y] != '-') && (grid[x + i][y] != word.charAt(i))) || (grid[x + i][y] != '-')) {return false;}}
		
		for (int i = 0; i < word.length(); i++) {grid[x + i][y] = word.charAt(i);}
		
		return true;
	}
	
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
	
	public boolean word(String word) {return word.matches("[A-Z_]*");}
}
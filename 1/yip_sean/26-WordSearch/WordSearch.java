import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class WordSearch {
	private char[][] grid;
	private ArrayList<String> wordList = new ArrayList<String>(), words = new ArrayList<String>();
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
	
	private boolean addWord(String word) {return addWord(word, 100);}
	private boolean addWord(String word, int retries) {
		for (int i = 0; i < retries; i++) {if (addWord(random.nextInt(grid.length), random.nextInt(grid[0].length), random.nextInt(8) + 1, word)) {return true;}}
		
		return false;
	}
	private boolean addWord(int orientation, String word) {return addWord(orientation, word, 100);}
	private boolean addWord(int orientation, String word, int retries) {
		for (int i = 0; i < retries; i++) {if (addWord(random.nextInt(grid.length), random.nextInt(grid[0].length), orientation, word)) {return true;}}
		
		return false;
	}
	private boolean addWord(int x, int y, String word) {
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
	private boolean addWord(int x, int y, int orientation, String word) {
		word = word.toUpperCase();
		if ((x < 0) || (x > grid.length - 1) || (y < 0) || (y > grid.length - 1) || (orientation < 0) || (orientation > 8) || !(word.matches("[A-Z_]*"))) {return false;}
		
		byte xOffset = 0, yOffset = 0;
		if (orientation == 0) {orientation = random.nextInt(8) + 1;}
		if (orientation == 1) {xOffset = 1; yOffset = 0;} //Horizontal
		if (orientation == 2) {xOffset = -1; yOffset = 0;} //Horizontal reversed
		if (orientation == 3) {xOffset = 0; yOffset = 1;} //Vertical
		if (orientation == 4) {xOffset = 0; yOffset = -1;} //Vertical reversed
		if (orientation == 5) {xOffset = -1; yOffset = 1;} //Diagonal left
		if (orientation == 6) {xOffset = 1; yOffset = -1;} //Diagonal left reversed
		if (orientation == 7) {xOffset = 1; yOffset = 1;} //Diagonal right
		if (orientation == 8) {xOffset = -1; yOffset = -1;} //Diagonal right reversed
		
		for (int i = 0; i < word.length(); i++) {if ((x + (i * xOffset) < 0) || (x + (i * xOffset) > grid.length - 1) || (y + (i * yOffset) < 0) || (y + (i * yOffset) > grid[0].length - 1) || ((grid[x + (i * xOffset)][y + (i * yOffset)] != '-') && (grid[x + (i * xOffset)][y + (i * yOffset)] != word.charAt(i)))) {return false;}}
		for (int i = 0; i < word.length(); i++) {grid[x + (i * xOffset)][y + (i * yOffset)] = word.charAt(i);}
		
		return true;
	}
	
	private int blanks() {
		int count = 0;
		for (int y = 0; y < grid[0].length; y++) {for (int x = 0; x < grid.length; x++) {if (grid[x][y] == '-') {count++;}}}
		
		return count;
	}
	
	public void createPuzzle(String filename, int numWords) throws FileNotFoundException {
		readWords(filename);
		while ((numWords > 0) && !(wordList.isEmpty())) {
			String word = wordList.remove(random.nextInt(wordList.size()));
			if ((blanks() >= word.length()) && (addWord(word))) {words.add(word);}
			numWords--;
		}
		System.out.println(this + "\n");
		fillRandom();
		System.out.println(this + "\n");
		System.out.println(words + "\n");
		Collections.sort(words);
		System.out.println("Alphabetical order:\n" + words);
	}
	
	private boolean readWords(String filename) throws FileNotFoundException {
		wordList = new ArrayList<String>();
		Scanner scanner = new Scanner(new File(filename));
		while (scanner.hasNext()) {
			String word = scanner.next().toUpperCase();
			if ((word.length() >= 3) && (word.matches("[A-Z_]*"))) {wordList.add(word);}
		}
		
		return true;
	}
		
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
	
	public static void main(String[] args) throws FileNotFoundException {
		String usage = "Usage: java WordSearch width height filename [numWords]\n";
		String help = "Type \"java WordSearch\" for help.";
		if ((args.length <= 0) || (args.length > 4)) {
			System.out.println(usage + "\nfilename: the location of the file containing the words, which are separated by whitespace, to put into the puzzle.");
			System.out.println("[numWords] (optional argument): number of words to put into the puzzle (can be greater than the number of words contained in filename). If not specified, put in as many words as possible.");
			System.exit(1);
		}
		if (args.length == 3) {
			args = Arrays.copyOf(args, args.length + 1);
			args[3] = "none";
		}
		if (!((args[0] + args[1]).matches("[0-9]+")) || (!(args[3].equals("none")) && !(args[3].matches("[0-9]+")))) {
			System.out.println(usage + "\nwidth, height and [numWords] must be non-negative integers.\n" + help);
			System.exit(1);
		}
		try {Scanner scanner = new Scanner(new File(args[2]));}
		catch (FileNotFoundException e) {
			System.out.println(usage + "\nFilename/path " + "\"" + args[2] + "\"" + " not found.\n" + help);
			System.exit(1);
		}
		
		int width = Integer.parseInt(args[0]);
		int height = Integer.parseInt(args[1]);
		int numWords = Integer.MAX_VALUE;
		if (!(args[3].equals("none"))) {numWords = Integer.parseInt(args[3]);}
		WordSearch ws = new WordSearch(width, height);
		ws.createPuzzle(args[2], numWords);
	}
}

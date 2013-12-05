import java.util.*;


public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        
	w.insertWordDul(5, 4, "Hello");
	System.out.println(w);
	w.fillPuzzle();
	System.out.println(w);
    }

}
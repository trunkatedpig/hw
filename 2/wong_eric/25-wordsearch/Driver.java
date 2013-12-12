import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	w.fillUp();
	System.out.println(w);

	w.fillBlanks();
	System.out.println(w);

	System.out.println(w.getWordList());       
    }
}

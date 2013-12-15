import java.util.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        
        System.out.println(w);
        w.addWords(5);
        System.out.println(w);
        System.out.println(w.getWordsUsed().toString());
	w.fillBlanks();
	System.out.println(w);
    }
}

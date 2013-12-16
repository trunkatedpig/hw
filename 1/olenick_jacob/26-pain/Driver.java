import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();//20 by 20
	w.autoWords(20);
	System.out.println(w);
	w.fillRest();
	System.out.println(w);
	System.out.println(w.words);
    }

}

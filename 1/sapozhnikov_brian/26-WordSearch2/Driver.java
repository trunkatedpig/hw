import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w.addWordH(5,5,"hello"));
	System.out.println(w);
	System.out.println(w.addWordHLeft(5,5,"hello"));
	System.out.println(w);
	System.out.println(w.addWordV(5,5,"hello"));
	System.out.println(w);
	System.out.println(w.addWordVUp(5,5,"hello"));
	System.out.println(w);
	System.out.println(w.addWordSE(5,5,"hello"));
	System.out.println(w);
	System.out.println(w.addWordNW(5,5,"hello"));
	System.out.println(w);
	System.out.println(w.addWordSW(5,5,"hello"));
	System.out.println(w);
	System.out.println(w.addWordNE(5,5,"hello"));
	System.out.println(w);
	w.fillRand();
	System.out.println(w);
    }

}

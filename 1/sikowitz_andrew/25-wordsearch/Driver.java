import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.addWordH(5, 5, "hello");
	w.addWordH(0, 13, "goodbye");
	System.out.println(w.addWordH(6,16,"apple"));
	w.addWordH(6, 15, "apple");
	System.out.println(w.addWordH(5,5,"hello"));
	w.addWordH(8, 4, "e");
	w.addWordH(8, 1, "pokes");
	System.out.println(w);
	w.addWordV(4, 6, "negligible");
	w.addWordV(0, 0, "hello");
	System.out.println(w.addWordV(16, 3, "night"));
	w.addWordV(15, 3, "night");
	System.out.println(w.addWordV(4, 0, "goodbye"));
	System.out.println(w);
    }

}

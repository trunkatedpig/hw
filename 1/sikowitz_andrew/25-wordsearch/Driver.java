import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH(5, 5, "hello");
	w.addWordH(0, 13, "goodbye");
	w.addWordH(6, 16, "apple");
	System.out.println(w.addWordH(5,5,"hello"));
	w.addWordH(8, 4, "e");
	w.addWordH(8, 1, "pokes");
	System.out.println(w);
    }

}

import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.test(w);
	w.insertHorizontal(3, 2, "aaabaaa");
	w.test(w);
	w.insertHorizontal(0, 1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	w.test(w);
	w.insertHorizontal(3, 2, "aa");
	w.test(w);
	w.insertHorizontal(0, 1, "asdf");
	w.test(w);
	w.insertHorizontal(3, 1, "fghj");
	w.test(w);
    }

}

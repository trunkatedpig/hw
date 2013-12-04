import java.util.*;


public class Driver {
    public static void main(String[] args) {
		WordSearch w = new WordSearch();
		w.AddWordH(0,0,"hello");
		w.AddWordH(0,15,"hello");
		System.out.println(w);
    }

}

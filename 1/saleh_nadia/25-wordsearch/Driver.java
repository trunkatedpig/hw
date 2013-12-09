import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.addWordH(5,5,"hello");
	System.out.println(w);
	w.addWordH(5,8,"lovely");
	System.out.println(w);
	System.out.println(w.addWordH(17,17,"world"));
	System.out.println(w);
    }

}

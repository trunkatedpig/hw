import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();

	w.addWordH(5,4,"Word");
	System.out.println(w);
	System.out.println(w.addWordH(19,19,"Word") + " should be false.");
	System.out.println(w.addWordH(5,3,"Word") + " should be false.");
	w.addWordH(5,5,"order");
	System.out.println(w);
    }
}

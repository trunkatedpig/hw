import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH(3,4, "Hello");
	System.out.println(w);
    }
}

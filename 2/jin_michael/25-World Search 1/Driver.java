import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch(2,20);
	System.out.println(w);
	System.out.println(w.addWordH(5,6,"word"));
	System.out.println(w);
    }
}

import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);
	w.addWordH(21,2,"Hello");
	System.out.println(w);
	w.addWordH(6,13,"Goodbye");
	System.out.println(w);
    }
}

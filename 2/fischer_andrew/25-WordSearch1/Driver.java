import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);
	w.AddWordH(2,2,"hello");
	System.out.println(w);
	w.AddWordH(2,4,"hello"); //should fail
	System.out.println(w);
	w.AddWordH(2,6,"orange"); //should tack onto the 'o'
	System.out.println(w);
    }
}

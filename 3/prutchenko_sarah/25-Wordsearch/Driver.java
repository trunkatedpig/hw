import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);
	w.addWordH(0,0,"bombastic");
	System.out.println(w);
	w.addWordH(13, 66, "nope");
	System.out.println(w);
	w.addWordH(5,2,"yep");
	System.out.println(w);
	w.addWordV(3, 8, "down");
	System.out.println(w);
	w.addWordD(7, 3, "diagonal");
	System.out.println(w);
    }
}

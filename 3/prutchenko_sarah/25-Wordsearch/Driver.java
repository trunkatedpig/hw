import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);
	w.addWordH(0,0,"Hello");
	System.out.println(w);
	w.addWordH(13, 66, "Nope");
	System.out.println(w);
	w.addWordH(5,2,"Yep");
	System.out.println(w);
    }
}

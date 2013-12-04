import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);
	w.addWordH(0,0,"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	System.out.println("\n");
	System.out.println(w);
	w.addWordH(0,0,"aaaaaa");
	System.out.println("\n");
	System.out.println(w);
	w.addWordH(19,19,"a");
	System.out.println("\n");
	System.out.println(w);
    }
}

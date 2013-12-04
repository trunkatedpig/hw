import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);
	System.out.println(w.addWordH(2,2,"Hello"));
	System.out.println(w);
	System.out.println(w.addWordH(6,18,"Goodbye"));
	System.out.println(w);
    }
}

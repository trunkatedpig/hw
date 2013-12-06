import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	System.out.println(w.addWordH(5,6,"word"));
	System.out.println(w);
	System.out.println(w.addWordV(16,7,"word"));
	System.out.println(w);
	System.out.println(w.addWordDBR(1,2,"word"));
	System.out.println(w);
	System.out.println(w.addWordDBL(1,4,"word"));
	System.out.println(w);
	System.out.println(w.addWordDTL(3,16,"word"));
	System.out.println(w);
    }
}

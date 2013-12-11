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
	System.out.println(w.addWordDBL(1,3,"word"));
	System.out.println(w);
	System.out.println(w.addWordDTL(14,3,"word"));
	System.out.println(w);
	System.out.println(w.addWordDTR(14,1,"word"));
	System.out.println(w);
	System.out.println(w.addWordHB(5,6,"word"));
	System.out.println(w);
	System.out.println(w.addWordVB(16,7,"word"));
	System.out.println(w);
	w.randomL();
	System.out.println(w);
    }
}

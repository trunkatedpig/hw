import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);
	w.addWordV(2,2,"Hello");
	System.out.println(w);
	w.addWordH(4,4,"World");
	System.out.println(w);
	w.backAddWordH(6,8,"yo");
	System.out.println(w);
	w.backAddWordV(10,15,"hey");
	System.out.println(w);
	w.diagSEaddWordH(3,11, "yooo");
	System.out.println(w);
	w.diagNEaddWordH(12,6,"hey");
	System.out.println(w);
	w.diagNWaddWordH(15,14,"what");
	System.out.println(w);
	w.diagSWaddWordH(14,6,"final");
	System.out.println(w);
	w.fillOutBoard();
	System.out.println(w);
    }
}

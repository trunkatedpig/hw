import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH(5,6,"tornado");
	System.out.println(w);
	System.out.println(w.addWordH(5,-3,"hogwarts"));
	System.out.println(w);
	System.out.println(w.addWordH(6,15,"radiator"));
	System.out.println(w);

    }

}

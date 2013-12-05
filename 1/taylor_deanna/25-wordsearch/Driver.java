import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch(10,20);
	System.out.println(w);
	w.addWordH(2,2,"Hello");
	System.out.println(w);
	w.addWordH(2,5,"love");
	System.out.println(w);
	w.addWordH(2,1,"hate");
	System.out.println(w);
	w.addWordH(8,18,"hate");
	System.out.println(w);
    }

}

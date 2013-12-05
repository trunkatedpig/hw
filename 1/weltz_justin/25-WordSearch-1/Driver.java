import java.util.*;


public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        w.insertWordH(6,4, "e");
	System.out.println(w);
	System.out.println(w.insertWordH(5, 4, "Hello"));
	System.out.println(w);
	System.out.println(w.insertWordH(5, -1, "wrong"));
	System.out.println(w.insertWordH(-1, 4, "wrong"));
	System.out.println(w.insertWordH(18, 4, "wrong"));
	System.out.println(w.insertWordH(5, 21, "Hello"));

    }

}

import java.util.*;


public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
	// System.out.println(w);
    w.addWordH(1, 1, "hello");
    w.addWordH(4,1,"overwrite");
    w.addWordH(5,2,"another");
    w.addWordH(21,2, "overboard");
    w.addWordH(2,21,"overboard");
    System.out.println(w);
    }

}

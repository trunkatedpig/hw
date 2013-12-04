import java.util.*;


public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
	w.test();
        System.out.println(w);
        System.out.println(w.addWordH(2,2,"LongWOrd"));
        System.out.println(w.addWordH(5,18,"LongWOrd"));
        System.out.println(w.addWordH(5,2,"See"));
        System.out.println(w.addWordH(5,2,"word"));
    }

}

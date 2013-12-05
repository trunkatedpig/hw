import java.util.*;


public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch(10,20);
	/* System.out.println(w);
        w.addWordH(2,2,"Hello");
        System.out.println(w);
        w.addWordH(2,5,"love");
        System.out.println(w);
        w.addWordV(2,1,"hate");
        System.out.println(w);
        w.addWordV(8,18,"hate");
        System.out.println(w);
	w.addWordHBackwards(1,1,"doggy");
	System.out.println(w);
	w.addWordVBackwards(3,3,"doggy");
	System.out.println(w);*/
	w.addWordDSE(1,1,"doggy");
	System.out.println(w);
	w.addWordDSW(1,9,"doggy");
	System.out.println(w);
    }

}
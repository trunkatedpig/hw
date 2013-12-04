import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.addWordH(2, 5, "test");
	w.addWordV(10, 10, "tester");
	System.out.println(w);
    }

}

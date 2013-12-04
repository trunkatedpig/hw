import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w.addWordH(5,6,"e"));
       	System.out.println(w);
	System.out.println(w.addWordH(5,5,"hello"));
	System.out.println(w);
    }

}

import java.util.*;


public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        
	w.insertWordH(5, 4, "Hello");
	System.out.println(w);
    }

}
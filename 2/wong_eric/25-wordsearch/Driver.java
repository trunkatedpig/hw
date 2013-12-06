import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);

	w.addWordH(10, 10, "Hello", "left");
	System.out.println(w);
       
    }
}

import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);
	System.out.println(w.addWordH(3,17,"hello"));
	System.out.println(w.addWordH(3,12,"hello"));
	System.out.println(w);
       
    }
}
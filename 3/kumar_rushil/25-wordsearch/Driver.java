import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	boolean b;	
	System.out.println(w);  
        b = w.addWordV(2,3,"Rushil");
	System.out.println(w);     
	System.out.println(b); 
        b = w.addWordH(2,3,"Rushil");
	System.out.println(w); 
	System.out.println(b); 
    }
}

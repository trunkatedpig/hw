import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
        
        w.addWordH(3,3,"Hello");        
        w.addWordH(5,5,"Hello");        
        w.addWordH(15,16,"Hello");        
	w.addWordV(7,7,"vert"); 
	      
	System.out.println(w);
	
    }
}

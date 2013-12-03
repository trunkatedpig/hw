import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);

	w.addWordH(1,1,"hello");
	System.out.println(w);
	w.addWordH(2,1,"world");
	System.out.println(w);
	w.addWordH(1,0,"test");
	System.out.println(w);
       
    }
}

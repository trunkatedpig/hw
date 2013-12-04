import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);

	System.out.println ( w.addWordH ( 3 , 20 , "hi" ) );
	System.out.println(w);

	System.out.println ( w.addWordH ( 3 , 19 , "hi" ) );
	System.out.println(w);

	System.out.println ( w.addWordH ( 10 , 3 , "hi" ) );
	System.out.println(w);
       
    }
}

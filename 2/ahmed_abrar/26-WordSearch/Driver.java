import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	/*	
	System.out.println(w);

	System.out.println ( w.addWordHR ( 3 , 20 , "hi" ) );
      	System.out.println(w);

	System.out.println ( w.addWordHL ( 3 , 19 , "hello" ) );
	System.out.println(w);

	System.out.println ( w.addWordVU ( 10 , 3 , "how" ) );
	System.out.println(w);

	System.out.println ( w.addWordDDL ( 15 , 3 , "you" ) );
	System.out.println(w);

	System.out.println ( w.addWordHR ( 15 , 3 , "you" ) );
	System.out.println(w);

	System.out.println ( w.addWordVD ( 15 , 3 , "you" ) );
	System.out.println(w);

	System.out.println ( w.addWordDDR ( 10 , 10 , "diag" ) );
	System.out.println(w);

	System.out.println ( w.addWordDDL ( 10 , 10 , "diag" ) );
	System.out.println(w);

	System.out.println ( w.addWordDUR ( 10 , 10 , "diag" ) );
	System.out.println(w);

	System.out.println ( w.addWordDUL ( 10 , 10 , "diag" ) );
	System.out.println(w);*/

//	w.loadWords( wordList );
	w.addWords();
	w.fill();
	System.out.println ( w );

    }
}

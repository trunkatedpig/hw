<<<<<<< HEAD
import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch(15,30);
        System.out.println(w);
        readWords(wordlist);
    }

}

=======
import java.io.*;
import java.util.*;

public class WordSearchDriver{
    
    public static void main(String[] args){
	
	WordSearch w = new WordSearch(20, 20);
	//System.out.println(w);
    /*  System.out.println(w);
	w.addWordH(3, 2, "moo");
	System.out.println(w);
	w.addWordH(5, 2, "oink");
	System.out.println(w);
	w.addWordH(12, 4, "squeek");
	System.out.println(w); */
	
        w.setWords(10);
	//System.out.println(w);
	System.out.println("\n\n" + w.getWords() + "\n");
	w.fillInBlanks();
	System.out.println(w);

    }
}
>>>>>>> bf3a700447573c58e6a86a140ca8250ee965929c

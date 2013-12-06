import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        
        System.out.println(w);

	w.addWordH(4,5,"timothy");
	System.out.println(w);

	w.addWordV(10,5,"timothy");
	System.out.println(w);

	w.addWordHb(15,17,"timothy");
	System.out.println(w);

	w.addWordVb(8,9,"timothy");
	System.out.println(w);

       	w.addWordHV(8,7,"timothy");
	System.out.println(w);

       	w.addWordHbV(5,19,"timothy");
	System.out.println(w);

       	w.addWordHVb(9,11,"timothy");
	System.out.println(w);

       	w.addWordHbVb(19,13,"timothy");
	System.out.println(w);
    }
}

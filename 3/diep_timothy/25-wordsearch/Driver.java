import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        
        System.out.println(w);

	w.addWordH(4,5,"YANKEES");
	System.out.println(w);

	w.addWordV(10,5,"GIANTS");
	System.out.println(w);

	w.addWordHb(17,17,"ISLANDERS");
	System.out.println(w);

	w.addWordVb(8,9,"JETS");
	System.out.println(w);

       	w.addWordHV(8,7,"KNICKS");
	System.out.println(w);

       	w.addWordHbV(5,19,"NETS");
	System.out.println(w);

       	w.addWordHVb(9,11,"RANGERS");
	System.out.println(w);

       	w.addWordHbVb(19,13,"METS");
	System.out.println(w);

	w.fill();
	System.out.println(w);
	   
    }
}

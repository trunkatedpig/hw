import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        
        System.out.println(w);

	w.addWordH(4,5,"Timothy");
	System.out.println(w);
       
	w.addWordH(24,5,"Timothy");
	System.out.println(w);

	w.addWordH(4,17,"Timothy");
	System.out.println(w);
       
    }
}

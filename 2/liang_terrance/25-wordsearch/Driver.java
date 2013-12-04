import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);
       

	System.out.println(w.AddWordH(4,10,"START"));
	System.out.println(w.AddWordH(4,9,"OVERLAPPED"));
	System.out.println(w.AddWordH(4,3, "OVERLAPS"));
	System.out.println(w.AddWordH(5,18,"OUTOFBOUNDS"));
	System.out.println(w);
    }
}

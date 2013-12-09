import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        Search s = new Search();

        System.out.println(s);
	s.WordH(5,10,"pasta");
	s.WordH(7,7,"potato");
	s.WordH(3,2,"abalaba");
	System.out.println("\n After adding basic words \n");
	System.out.println(s);
	s.WordH(3,7,"baby");
	s.WordH(7,5,"brainwash");
	s.WordH(17,15,"mother");
	System.out.println("\n After adding words that violate conditions \n and baby to the end of abalaba \n");
	System.out.println(s);
	s.WordV(12,6,"potato");
	s.WordV(7,6,"pumpkins");
	System.out.println("\n After adding one vertical word \n and one that violates conditions \n");
	System.out.println(s);


    }
}
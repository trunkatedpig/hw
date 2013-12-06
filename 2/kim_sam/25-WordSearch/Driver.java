import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        
        System.out.println(w);
        w.AddwordH(2,2,"hello");

        System.out.println(w);
        w.AddwordH(2,6,"old");

        System.out.println(w);
	w.AddwordV(2,2,"howdy");

	System.out.println(w);
	w.AddwordHReverse(6,5,"away");

	System.out.println(w);
	w.AddwordVReverse(8,8,"allowed");

	System.out.println(w);
	
    }
}
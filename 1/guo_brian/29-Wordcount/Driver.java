import java.io.*;
import java.util.*;

public class Driver {
    
    public static void main (String[] args ) {
	Wordcount w = new Wordcount();
	w.WordCount("thePrince.txt");
	System.out.println(w.getCount('e'));
    }
}

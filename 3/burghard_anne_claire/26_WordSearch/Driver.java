import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){
        
        WordSearch w = new WordSearch(25,50);
	System.out.println(w);
	w.withSpaces(10);
	System.out.println(w);
	w.complete(10);
        System.out.println(w);
    }
}

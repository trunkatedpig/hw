import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch(35,35);
	System.out.println(w);
	w.insertWords(15);
	System.out.println(w);
	w.fillBlanks();
	System.out.println(w);
	System.out.println(w.getWordBank());
    }
}

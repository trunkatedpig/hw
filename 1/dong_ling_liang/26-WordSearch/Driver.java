import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.generatePuzzle(5);
	w.printInfo();
	System.out.println(w.toString());

    }
}
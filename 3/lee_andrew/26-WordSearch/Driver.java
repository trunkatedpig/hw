import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();

      	w.play();
	System.out.println(w);
	w.fillSpaces();
        System.out.println(w);
	System.out.println("Words to find: " + w.Words());
    }
}
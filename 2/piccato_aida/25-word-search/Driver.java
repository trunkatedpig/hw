import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	System.out.println(w.getWords());
        w.fillWords(4);
	System.out.println(w);

	w.fillSpaces();
	System.out.println(w);


    }
}


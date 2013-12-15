import java.util.*;
import java.io.*;

//WORKED WITH AIDA

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch(20,60);

	w.loadWords("wordList");
	w.fillWords(50);
	System.out.println(w);
	w.fillSpaces();
	System.out.println(w);
	System.out.println(w.getWords());
    }

}

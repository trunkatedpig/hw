import java.util.*;
import java.io.*;

//WORKED WITH AIDA

public class Driver {
    public static void main(String[] args) {
		WordSearch w = new WordSearch();

		System.out.println(w);
		w.loadWords(wordList);
		w.fillWords(20);
		w.fillSpaces();
		System.out.println(w);
    }

}

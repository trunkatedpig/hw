import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch(15,30);
        System.out.println(w); //blank wordsearch
	w.readWords(wordlist);
	w.createBoard();
        System.out.println(w);
        w.fillInBlanks();
        System.out.println(w);
    }

}

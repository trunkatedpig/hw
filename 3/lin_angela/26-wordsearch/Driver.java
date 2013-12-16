import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch(15,30);
        System.out.println(w); //blank wordsearch
	w.createBoard();
        System.out.println(w); //only words in wordlist
        w.fillInBlanks();
        System.out.println(w);
    }

}

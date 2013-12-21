import java.util.*;
import java.io.*;


public class Driver {
    public static void main(String[] args){
        WordSearch w = new WordSearch();

        System.out.println(w);

	
	w.loadWords("wordList");
        w.fillWords(10);
        System.out.println(w);


        w.fillBlanks();
        System.out.println(w);
        System.out.println(w.getWords());



    }
}

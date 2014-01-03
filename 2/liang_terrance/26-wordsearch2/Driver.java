import java.util.*;
import java.io.*;


public class Driver {
    public static void main(String[] args){
	WordSearch w = new WordSearch(20,40);
	w.loadWords("wordlist");
	w.fillWords();
	w.fill();
	System.out.println(w);       

    }
}

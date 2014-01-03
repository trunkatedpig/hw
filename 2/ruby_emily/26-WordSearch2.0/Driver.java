import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	WordSearch w=new WordSearch();
	String f="wordlist";
	w.makePuzzle(f);
	System.out.println(w);
	w.fillBlanks();
	System.out.println(w);
    }
}

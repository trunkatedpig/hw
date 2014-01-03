import java.util.*;

public class Driver {
    public static void main(String[] args) {
	String s;
	WordSearch w = new WordSearch();
	System.out.println(w);
	/*
	s = w.randWord();
	w.addWordRand(s);
	System.out.println("Added " + s);
	System.out.println(w); 
	*/
	w.makeGame(10);
	System.out.println(w.getWordsUsed());

    }
}

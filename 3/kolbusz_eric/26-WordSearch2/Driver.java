import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){
	
	WordSearch w = new WordSearch(20,40);

	w.genGame();
	System.out.println(w);
	
	w.fillSpaces();
	System.out.println(w);
	System.out.println();
	System.out.println(w.addedWords);

    }
}

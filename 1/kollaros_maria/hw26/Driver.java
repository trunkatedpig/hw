import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
	WordSearch w = new WordSearch(20,40);
	w.RandWords();
	System.out.println(w);
	w.FillIn();
	System.out.println(w);
	System.out.println(w.usedWords);
    }
}

	

import java.io.*;
import java.util.*;

public class WordSearchDriver{
    
    public static void main(String[] args){
	
	WordSearch w = new WordSearch(10, 10);
     	//System.out.println(w.toString());
	
	w.addWordH(3, 2, "moo");
	//System.out.println(w.toString());
	
	w.addWordH(5, 2, "oink");
	//System.out.println(w.toString());
	
	w.addWordH(12, 4, "squeek");
	//System.out.println(w.toString());

    }
}

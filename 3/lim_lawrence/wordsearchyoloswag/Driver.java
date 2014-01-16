import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){
	
	WordSearch w = new WordSearch(15,40);
	System.out.println(w);
	w.addWord(0,0,1,1,"yoloyolo");
	w.addWord(3,1,0,1,"wooooord");
	System.out.println(w);
    }
}

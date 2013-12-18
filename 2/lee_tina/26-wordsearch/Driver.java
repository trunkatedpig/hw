import java.util.*;
import java.io.*;

/*public class Driver {
    public static void main(String[] args) {
        wordSearch w = new wordSearch();
        
        System.out.println(w);
       
    }
}*/

public class Driver {
    public static void main(String[] args){
        WordSearch w = new WordSearch(15,40);
        System.out.println(w);
	w.fillBlanks();
	System.out.println(w);
	System.out.println(w.getWordsUsed());


    }
}

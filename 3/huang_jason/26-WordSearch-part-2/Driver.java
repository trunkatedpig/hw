import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){
        
        WordSearch w = new WordSearch(12,12);

	System.out.println(w);

	w.fillSpaces();

	System.out.println(w);

    }
}


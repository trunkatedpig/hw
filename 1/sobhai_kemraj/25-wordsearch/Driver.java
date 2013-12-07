import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
        WordSearch w = new WordSearch();
	System.out.println(w);
        System.out.println(w.addWordVup(10,10,"David"));
        System.out.println(w);
        System.out.println(w.addWordVup(12,14,"Bang"));
        System.out.println(w);

    }

}


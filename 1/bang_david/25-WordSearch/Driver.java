import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
        WordSearch w = new WordSearch();
	System.out.println(w);
        System.out.println(w.addWordH(10,1,"David"));
        System.out.println(w);
        System.out.println(w.addWordH(10,3,"Bang"));
        System.out.println(w);

    }

}


import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
        WordSearch w = new WordSearch();

        //System.out.println(w);

        System.out.println(w.addWordH(4, 2, "hello"));
        System.out.println(w.addWordH(20, 19, "hello"));
        System.out.println(w.addWordH(6, 15, "hello"));
    }
}

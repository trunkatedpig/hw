import java.io.*;
import java.util.*;


public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch(10,20);

        System.out.println(w);
        w.addWordH(2,2,"hello");

        System.out.println(w);
        w.addWordH(2,5,"snow");

        System.out.println(w);
        w.addWordH(4,1,"snow");

        System.out.println(w);
        w.addWordH(2,1,"blue");

        System.out.println(w);
        w.addWordH(8,18,"blue");

        System.out.println(w);
        w.addWordH(8,4,"blue");

        System.out.println(w);
    }

}

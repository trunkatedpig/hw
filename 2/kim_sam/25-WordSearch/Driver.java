import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        
        System.out.println(w);
        w.AddwordH(2,2,"hello");

        System.out.println(w);
        w.AddwordH(2,4,"hello");

        System.out.println(w);
        w.AddwordH(2,6,"old");

        System.out.println(w);
    }
}
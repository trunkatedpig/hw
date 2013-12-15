import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch(10,20);
	w.puzzle();
	System.out.println(w);
    }

}

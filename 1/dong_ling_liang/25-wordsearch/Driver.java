import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	System.out.println("+++++++++++++++++++");
	w.addWordH(3,3,"swagtastic");
	System.out.println(w);
    }

}

import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	WordSearch w = new WordSearch();

	System.out.println(w);
	w.addWordH(2,4,"this");
	System.out.println(w);
	w.addWordH(2,6,"that");
	System.out.println(w);
    }
}

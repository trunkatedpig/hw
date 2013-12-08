import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.addWordH(3,3,"swagtastic");
	w.addWordV(4,5,"sostress");
	w.addWordHB(15,15,"exo");
	w.addWordVB(10,10,"peanuts");
	System.out.println(w);
    }

}

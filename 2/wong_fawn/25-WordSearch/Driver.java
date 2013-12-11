import java.util.*;
import java.io.*;

//WORKED WITH AIDA

public class Driver {
    public static void main(String[] args) {
		WordSearch w = new WordSearch();
		w.addWordH(1,0,"hello");
		w.addWordH(1,3,"love");
		w.addRevV(6,5,"hi");
		w.addWordDes(7,7,"goodbye");
		w.addRevAsc(9,10, "fawn");
		System.out.println(w);
		w.fillSpaces();
		System.out.println(w);
    }

}

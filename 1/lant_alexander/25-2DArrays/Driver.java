import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch(20,20);
	
	System.out.println(w);
	w.AddWordHR(1, 1, "caspar");
	w.AddWordHR(1, 3, "parma");
	w.AddWordVD(3,3, "blam");
	w.AddWordVU(8,6, "blam");
	w.AddWordHL(10,10, "maria");
	w.AddWordHL(11, 11, "redrum");
	System.out.println(w);


    }

}

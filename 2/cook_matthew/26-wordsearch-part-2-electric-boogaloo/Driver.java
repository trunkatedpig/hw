import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	/*System.out.println(w);
	System.out.println(w.addWordHB(11,6, "hello"));
	System.out.println(w);
	System.out.println(w.addWordVU(11,9,"tornado"));
	System.out.println(w);
	System.out.println(w.addWordH(5,-3,"hogwarts"));
	System.out.println(w);
	System.out.println(w.addWordDRU(8,9,"noose"));
	System.out.println(w);
	System.out.println(w.addWordH(8,5,"cabinet"));
	System.out.println(w);
	w.fill();
	System.out.println(w);
	*/
	w.getWords("wordlist");
	w.makeSearch(15);
    }


}

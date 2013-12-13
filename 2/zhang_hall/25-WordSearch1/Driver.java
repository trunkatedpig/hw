import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	System.out.println(w.addWordDiagUpRight(14,16,"hello")); //false
	System.out.println(w.addWordDiagUpRight(18,4,"yaywordsearch")); //true
	//	System.out.println(w.addWordDiag(21,10,"goodbye"));
	System.out.println(w);
    }
}

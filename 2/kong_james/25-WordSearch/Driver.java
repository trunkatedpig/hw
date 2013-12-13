import java.util.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        w.addWordHR(15,1,"bubblegum");
	w.addWordHL(14,9,"tree");
	w.addWordVU(13,10,"airplane");
	w.addWordVD(2,19,"bomb");
	w.addWordNE(6,3,"magic");
	w.addWordNW(12,4,"power");
	w.addWordSE(14,12,"yay");
	w.addWordSW(13,19,"hello");
	w.fill();
	System.out.println(w);

       
    }
}

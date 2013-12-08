import java.util.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        /*w.addWordH(9,4,"double");
        w.addWordH(9,5,"elephant");
        w.addWordH(9,9,"elephant");
        w.addWordH(4,5,"Yay");
        w.addWordH(7,19,"Failure");*/
        w.addWordHR(15,16,"Bubblegum");
	w.addWordRU(13,5,"Hello");
	w.addWordRD(1,1,"bye");
	w.addWordLD(17,16,"yo");
	w.addWordLU(5,19,"bird");

	w.addWordHL(16,10,"keyboard");
	/*w.addWordVD(4,6,"hello");
	w.addWordVU(5,7,"hi");*/
        System.out.println(w);
       
    }
}
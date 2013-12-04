import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.addWordH(9,4,"double");
	w.addWordH(9,5,"elephant");
	w.addWordH(9,9,"elephant");
	w.addWordH(4,5,"Yay");
	w.addWordH(7,19,"Failure");
	w.addWordH(15,3,"Bubblegum");
	System.out.println(w);
       
    }
}

import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);
	w.AddWordH(2,2,"hello");
	//	System.out.println(w);
		w.AddWordH(2,4,"hello"); //should fail
	//System.out.println(w);
	w.AddWordH(2,6,"orange"); //should tack onto the 'o'
	//System.out.println(w);
	
	w.AddWordV(2,2,"hacking");
	System.out.println(w);

	w.AddWordHB(5,6,"test");
	System.out.println(w);

	w.AddWordSE(7,9,"sEast");
	w.AddWordSW(7,9,"sWast");
	w.AddWordNE(7,17,"nEast");
	w.AddWordNW(7,17,"nWast");
	
	System.out.println(w);
	
	w.fill();
	System.out.println(w);
	
    }
}

import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	// w.addWordH(0, 0, "test");
	// w.addWordV(0, 19, "test");
	// w.addWordHx(0, 4, "test");
	// w.addWordVx(0, 18, "test");
	// w.addWordNE(19, 0, "test");
	// w.addWordNW(19, 19, "test");
	// w.addWordSE(15, 16, "test");
	// w.addWordSW(15, 3, "test");
	//w.addWordNEx(15, 3, "test");
	//w.addWordNWx(5, 5, "test");
	//w.addWordSEx(0, 0, "test");
	//w.addWordSWx(0, 19, "test");
	w.fill();
	System.out.println(w);
    }

}

import java.util.*;


public class Driver {
    public static void main(String[] args) {
		WordSearch w = new WordSearch();
		w.AddWordH(1,0,"hello");
		w.AddWordH(1,3,"love");
		w.AddWordV(0,0,"bye");
		w.AddReverseV(6,5,"hi");
		System.out.println(w);
    }

}

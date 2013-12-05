import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch(10,20);
	System.out.println(w);
    w.AddWordH(1, 1, "caspar");
    w.AddWordH(1, 3, "parma");
    w.AddWordV(3,3, "blam");
    System.out.println(w);


    }

}

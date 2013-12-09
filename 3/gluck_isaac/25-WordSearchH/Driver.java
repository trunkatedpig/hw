import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();

	System.out.println(w.addWordBackwardD(1,6,"TEST"));
	System.out.println(w);

	System.out.println(w.addWordBackwardV(1,7,"TEST"));
       System.out.println(w);
    }
}

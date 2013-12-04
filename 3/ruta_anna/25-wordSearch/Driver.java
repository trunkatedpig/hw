import java.util.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();

        System.out.println(w);
        System.out.println();

        w.addWordH(3,5,"ANNA");
        w.addWordH(3,7,"JOHN");
		w.addWordH(5,19,"AH");
		w.addWordH(7,18,"LUIS");
		w.addWordH(20,5,"RUTA");
		System.out.println(w);
    }
}
import java.util.*;

public class Driver {
    public static void main(String[] args) {

    	WordSearch w1 = new WordSearch(); // auto 20 x 20

        System.out.println(w1); 
        System.out.println("Default grid.");

        w1.addWordFromList();

        System.out.println(w1);
        System.out.println("One word added.");

        w1.addWordsFromList(5);

        System.out.println(w1);
        System.out.println("Five more words added.");

        WordSearch w2 = new WordSearch(); // auto 20 x 20

        System.out.println(w2); 
        System.out.println("Default grid.");

        w2.setup();
        System.out.println(w2);
        System.out.println("Full game setup.");

    }
}
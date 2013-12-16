import java.util.*;

public class Driver {
    public static void main(String[] args) {

		System.out.println();
		System.out.println("*-* Testing class WordSearch*-*");
		System.out.println();

        WordSearch w = new WordSearch(20,20,"Colors.txt");

		System.out.println("Answer to the WordSearch");
		w.createWordSearch(15);
		System.out.println(w);
		System.out.println();

		System.out.println("WordSearch");
		w.fillInBoard();
		System.out.println(w);
		System.out.println();
    }
}
import java.util.*;


public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
	System.out.println(w.addWord(0,17,"hello"));
	System.out.println(w.addWord(5,2,"hello"));
	System.out.println(w.addWord(5,3,"hello"));
	System.out.println(w.addWord(10,7,"world"));
        System.out.println(w);
	System.out.println(w.addWord(10,7,"wow"));
    }

}

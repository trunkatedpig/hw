import java.util.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        w.addWordH(2,6,"doge");
        w.addWordH(12,5,"rawr");
        System.out.println(w);
    }
}

import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();

	System.out.println(w.addWordH(1,9,"LongWord"));
	System.out.println(w.addWordH(5,2, "snowflake"));
	System.out.println(w.addWordH(5,6, "flakes"));
	System.out.println(w);
    }

}

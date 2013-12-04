import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	boolean b = w.addWordH(3,5,"StringMuch");
	System.out.println(b + "\n" + w);
       
    }
}

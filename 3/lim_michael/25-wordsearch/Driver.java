import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	boolean b = w.addWordH(3,5,"StringMuch");
	System.out.println(b + "\n" + w);
	boolean b1 = w.addWordH(-1,4,"StringMuch");
	System.out.println(b1 + "\n" + w);
	boolean b2 = w.addWordH(21,3,"StringMuch");
	System.out.println(b2 + "\n" + w);
	boolean b3 = w.addWordH(18,17,"StringMuch");
	System.out.println(b3 + "\n" + w);
	boolean b4 = w.addWordH(3,4,"StringMuch");
	System.out.println(b4 + "\n" + w);
	boolean b5 = w.addWordH(4,7,"StringMuch");
	System.out.println(b5 + "\n" + w);
       
    }
}

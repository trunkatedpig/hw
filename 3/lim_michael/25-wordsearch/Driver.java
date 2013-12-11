import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	boolean b = w.addWordH(3,5,"StringMuch");
	System.out.println(b + "\n" + w);

	WordSearch2 w2 = new WordSearch2();
	boolean l1 = w2.addWord(0,0,"ONE",1);
	boolean l2 = w2.addWord(3,7,"TWO",2);
	boolean l3 = w2.addWord(4,0,"THREE",3);
	boolean l4 = w2.addWord(19,19,"FOUR",4);
	boolean l5 = w2.addWord(18,19,"FIVE",5);
	boolean l6 = w2.addWord(14,10,"SIX",6);
	boolean l7 = w2.addWord(7,7,"SEVEN",7);
	boolean l8 = w2.addWord(8,8,"EIGHT",8);
	System.out.println(w2);
    }
}

import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);

	w.addWordH(10, 10, "hello", "left");
	System.out.println(w);

	w.addWordH(0, 0, "cross", "right");
	System.out.println(w);

	w.addWordV(10, 10, "hold", "down");
	System.out.println(w);

	w.addWordV(14, 19, "up", "up");
	System.out.println(w);

	w.addWordD(4, 10, "word", "up left");
	System.out.println(w);

	w.addWordD(19, 5, "are", "up right");
	System.out.println(w);

	w.addWordD(13, 10, "super", "down left");
	System.out.println(w);

	w.addWordD(15, 2, "fun", "down right");
	System.out.println(w);

	w.fillUp();
	System.out.println(w);
       
    }
}

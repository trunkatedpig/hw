import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.addWordH(5,5,"eric","right");
	w.addWordV(11,16,"hello","down");
	w.addWordD(10,10,"computer","up right");
	w.addWordH(18,18,"science","left");
	w.addWordD(8,5,"qwerty","down right");
	w.fillUp();
	System.out.println(w);
	
       
    }
}

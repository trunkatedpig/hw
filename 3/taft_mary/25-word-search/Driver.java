import java.util.*;

public class Driver {
    public static void main(String[] args) {

	WordSearch w = new WordSearch();
	
	System.out.println("Original board:\n\n"+w);
	System.out.println();

	w.addWordH(9,7,"hello");
	w.addWordH(11,7,"world");
	w.addWordV(1,1,"bonjour");
	w.addWordD(15,15,"hola");
	System.out.println("Updated board:\n\n"+w);
	System.out.println();

	/*

	w.resetBoard();
	
	//Test Cases:

	//input runs into another word
	w.addWordH(8,2,"test");
	System.out.println(w);

	//row exceeds board
	w.addWordH(21,0,"test");
	System.out.println(w);
	w.addWordH(-1,0,"test");
	System.out.println(w);

	//column exceeds board
	w.addWordH(0,21,"test");
	System.out.println(w);
	w.addWordH(0,-1,"test");
	System.out.println(w);

	*/

    }
}

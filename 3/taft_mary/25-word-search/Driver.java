import java.util.*;

public class Driver {
    public static void main(String[] args) {

	WordSearch w = new WordSearch();
	
	System.out.println("Original board:\n\n"+w);
	System.out.println();

	w.addWordH(8,5,"hello");
	w.addWordH(10,5,"world");
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

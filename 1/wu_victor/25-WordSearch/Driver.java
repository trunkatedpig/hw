import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch(10,20);
	/*
	System.out.println(w);
	w.addWordH(2,2,"Hello");
	System.out.println(w);
	w.addWordH(2,5,"love");
	System.out.println(w);
	w.addWordH(8,18,"hate");
	System.out.println(w);
	
	System.out.println(w);
	w.addWordV(2,4,"Hello");
	System.out.println(w);
	w.addWordV(5,8,"love");
	System.out.println(w);
	w.addWordV(8,15,"hate");
	System.out.println(w);

	System.out.println(w);
	w.addWordBackH(2,4,"Hello");
	System.out.println(w);
	w.addWordBackH(5,8,"love");
	System.out.println(w);
	w.addWordBackH(8,15,"hate");
	System.out.println(w);

	System.out.println(w);
	w.addWordBackV(2,4,"Hello");
	System.out.println(w);
	w.addWordBackV(5,8,"love");
	System.out.println(w);
	w.addWordBackV(8,15,"hate");
	System.out.println(w);
	*/ 

	System.out.println(w);
	w.addWordBLeft(2,4,"Hello");
	System.out.println(w);
	w.addWordBLeft(5,8,"love");
	System.out.println(w);
	w.addWordBLeft(8,15,"hate");
	System.out.println(w);



    }

}

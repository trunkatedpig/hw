import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch(10,20);
	System.out.println(w);
	w.addWordHR(2,2,"Hello");
	System.out.println(w);
	w.addWordHR(2,5,"love");
	System.out.println(w);
	w.addWordHR(2,1,"hate");
	System.out.println(w);
	w.addWordHR(8,18,"hate");
	System.out.println(w);
	w.addWordVD(4,4,"Coby");
	System.out.println(w);
	w.addWordVD(5,5,"is");
	System.out.println(w);
	w.addWordVD(4,6,"icky");
	System.out.println(w);
	w.addWordVU(8,9,"icky");
	System.out.println(w);
	w.addWordDUR(7,7,"yo");
	System.out.println(w);
	
    }

}

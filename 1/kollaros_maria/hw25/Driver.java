import java.util.*;


public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
	System.out.println(w.addWordHR(5,2,"harry"));
	System.out.println(w.addWordHL(2,10,"hogwarts"));
	System.out.println(w.addWordVD(3,15,"ron"));
	System.out.println(w.addWordVD(2,10,"hermione"));
	System.out.println(w.addWordVD(2,3,"snape"));
	System.out.println(w.addWordVU(2,3,"snape"));
	System.out.println(w.addWordDLD(1,6,"fred"));	
	System.out.println(w.addWordDRU(19,9,"dumbledore"));
	System.out.println(w.addWordDRD(13,14,"george"));
	System.out.println(w.addWordDLU(17,11,"malfoy"));
	System.out.println(w.addWordHR(8,9,"snape"));
	System.out.println(w.addWordVD(10,0,"voldemort"));
	System.out.println(w.addWordHL(10,15,"hagrid"));
	System.out.println(w.addWordVU(17,4,"siruis"));
	System.out.println(w.addWordHR(11,2,"lestrange"));
	System.out.println(w.addWordHL(0,18,"ginny"));
	System.out.println(w.addWordHR(0,3,"weasley"));
	System.out.println(w.addWordDRU(9,4,"riddle"));
	System.out.println(w);
        //w.fillIn();

     
    }

}
















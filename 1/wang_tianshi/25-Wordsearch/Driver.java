import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	//System.out.println(w);
	System.out.println(w.addWordH(0,3,"FIRSTBLOOD"));
	System.out.println(w.addWordH(4,9,"DOUBLEKILL"));
	System.out.println(w.addWordH(10,10,"TRIPLEKILL"));
	System.out.println(w.addWordH(17,0,"QUADRAKILL"));
	System.out.println(w.addWordH(15,12,"PENTAKILL"));
	System.out.println(w.addWordH(201,1,"VICTORY"));
	System.out.println(w);

    }

}

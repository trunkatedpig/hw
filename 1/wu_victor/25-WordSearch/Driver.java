import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	
	System.out.println(w.insertWordH(1,1,"Hello"));
	System.out.println(w.insertWordH(1,1,"HellWorld"));
	System.out.println(w.insertWordH(6,15,"Hey"));
	System.out.println(w.insertWordH(17,16,"What"));

	System.out.println(w);

    }

}

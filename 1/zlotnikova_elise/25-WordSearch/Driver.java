import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	//System.out.println(w);
	System.out.println(w.addWordH(0,0,"hello"));
	System.out.println(w);
	System.out.println(w.addWordH(0,2,"world"));
	System.out.println(w);


    }

}

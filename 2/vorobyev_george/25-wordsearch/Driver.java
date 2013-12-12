import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);
	w.add(1, 1,0,0,"apples");
	System.out.println(w);
	w.add(-1, -1, 18,5,"pie");
	System.out.println(w);
	w.add(1,-1,8,5,"sadness");
	System.out.println(w);
	w.add(0, 0, 0,25,"wheeee");
	System.out.println(w);
	w.add(1, 0, 13,17,"bworp");
	System.out.println(w);
       
    }
}

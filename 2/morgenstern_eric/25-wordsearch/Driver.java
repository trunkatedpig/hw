import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w.addWordH(5,5,"eric"));
	System.out.println(w.addWordH(5,6,"hello"));
	System.out.println(w.addWordH(10,22,"i"));
	System.out.println(w.addWordH(19,19,"aa"));
	System.out.println(w.addWordH(2,12,"qwerty"));
	System.out.println(w);
	
       
    }
}

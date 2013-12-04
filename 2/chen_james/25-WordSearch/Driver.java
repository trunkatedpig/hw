import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	 w.AddWordH(0,0,"James");
     //w.AddWordH(3,16,"Emily");
	 w.AddWordH(3,4,"Emily");
	System.out.println(w);
       
    }
}

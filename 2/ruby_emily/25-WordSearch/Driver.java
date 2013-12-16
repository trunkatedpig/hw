import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	 w.AddWordH(0,0,"James");
	 w.AddWordH(3,13,"Emily");
	 w.AddWordH(3,16,"tryagain");
	 System.out.println(w.toString());
       
    }
}

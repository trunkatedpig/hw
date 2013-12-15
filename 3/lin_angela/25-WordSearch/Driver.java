import java.util.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        
	//   System.out.println(w);
	//	w.addWordH(2,3,"hello");
	//	System.out.println(w);
	//	w.addWordH(2,4,"ello");
	//	System.out.println(w);
	//	System.out.println(w.addWordH(2,2,"halala"));
	//	System.out.println(w);
	//	System.out.println(w.addWordH(15,16,"heheh"));
	System.out.println(w);
	w.addWordV(1,2,"hello");
	System.out.println(w);
	w.addWordV(19,3,"hello");
	w.addWordV(0,2,"hehe");
	System.out.println(w);
	w.addWordV(0,2,"hh");
	System.out.println(w);
       
    }
}

import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	System.out.println(w);
	
	System.out.println("Trying to add 'HelloWorld' starting from row -1, column 2");
	System.out.println(w.addWordH(-1,2,"HelloWorld"));
	System.out.println(w);

	System.out.println("Trying to add 'HelloWorld' starting from row 23, column 2");
	System.out.println(w.addWordH(23,2,"HelloWorld"));
	System.out.println(w);

	System.out.println("Trying to add 'HelloWorld' starting from row 12, column 2");
	System.out.println(w.addWordH(12,2,"HelloWorld"));
	System.out.println(w);

	System.out.println("Trying to add 'HelloWorld' starting from row 5, column -5");
	System.out.println(w.addWordH(5,-5,"HelloWorld"));
	System.out.println(w);

	System.out.println("Trying to add 'HelloWorld' starting from row 16, column 10");
	System.out.println(w.addWordH(16,10,"HelloWorld"));
	System.out.println(w);

	System.out.println("Trying to add 'HelloWorld' starting from row 3, column 12");
	System.out.println(w.addWordH(3,12,"HelloWorld"));
	System.out.println(w);
    }
}

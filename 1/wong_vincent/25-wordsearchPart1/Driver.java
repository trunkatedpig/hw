import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch a = new WordSearch();
	System.out.println(a);

	System.out.println("_________________________");

	System.out.println(a.insertWordH(0,0,"Vincent"));
	System.out.println(a);

	System.out.println(a.insertWordH(19,19,"is Awesome"));
	System.out.println(a);
    }
}

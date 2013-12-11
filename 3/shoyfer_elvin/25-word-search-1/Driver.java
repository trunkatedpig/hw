import java.util.*;

public class Driver {
    public static void main(String[] args) {

    	WordSearch w1 = new WordSearch(); // auto 20 x 20

    	System.out.println(w1);

    	System.out.println("\n --- New Test --- \n");
    	System.out.println("Adding 'foo' at (0,0)");
    	System.out.println(w1.addWordH(0,0,"foo"));
    	System.out.println(w1);

    	System.out.println("\n --- New Test --- \n");
    	System.out.println("Adding 'bar' at (18,17)");
    	System.out.println(w1.addWordH(18,17,"bar"));
    	System.out.println(w1);

    	System.out.println("\n --- New Test --- \n");
    	System.out.println("Adding 'foo' at (0,1)");
    	System.out.println(w1.addWordH(0,1,"foo"));
    	System.out.println(w1);
    	System.out.println("This should fail. Cannot overwrite.");

    	System.out.println("\n --- New Test --- \n");
    	System.out.println("Adding 'foobar' at (0,0)");
    	System.out.println(w1.addWordH(0,0,"foobar"));
    	System.out.println(w1);
    	System.out.println("This should pass, overwriting 'foo' from Test 1.");

    	System.out.println("\n --- New Test --- \n");
    	System.out.println("Adding 'baz' at (0,19)");
    	System.out.println(w1.addWordH(0,19,"baz"));
    	System.out.println(w1);
    	System.out.println("This should fail; partial out of bounds.");

    	System.out.println("\n --- New Test --- \n");
    	System.out.println("Adding 'foobar' at (21,0)");
    	System.out.println(w1.addWordH(21,0,"foobar"));
    	System.out.println(w1);
    	System.out.println("This should fail; total out of bounds.");


    }
}
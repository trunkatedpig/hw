import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
    	For f = new For();
    	System.out.println("\nTest For Fact For Loop\n");
    	System.out.println(f.fact3(0));
    	System.out.println(f.fact3(1));
    	System.out.println(f.fact3(2));
    	System.out.println(f.fact3(3));
    	System.out.println(f.fact3(4));
    	System.out.println("\nTest For Reverse\n");
    	System.out.println(f.Reverse("swagtest"));
    	System.out.println("\nTest For Table\n");
    	System.out.println(f.table(5,3));

	}
}


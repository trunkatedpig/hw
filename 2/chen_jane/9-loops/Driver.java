import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String[] args) {

	Loops l = new Loops();
	System.out.println("Recursion version: ");
	System.out.println(l.fact(0));
	System.out.println(l.fact(1));
	System.out.println(l.fact(5));
	System.out.println("\nWhile loop: ");
	System.out.println(l.fact2(0));
	System.out.println(l.fact2(1));
	System.out.println(l.fact2(5));

    }
}

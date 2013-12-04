import java.io.*;
import java.util.*;

public class Driver {
    public static void main( String[] args ) {
	Loops l;
	l = new Loops();
	System.out.println(l.fact(0));
	System.out.println(l.fact(3));
	System.out.println(l.fact(6));
	System.out.println(l.fact(10));
	System.out.println(l.fact2(0));
	System.out.println(l.fact2(3));
	System.out.println(l.fact2(6));
	System.out.println(l.fact2(10));
    }
}
import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	myList l = new myList();
	Random r = new Random();
	int arg = Integer.parseInt(args[0]);

	for (int i=0; i<arg; i++) {
	    l.add(r.nextInt(20));
	    System.out.println(l);
	}
	
	System.out.println("Second round of testing: ");
	l.insert(3,50);
	System.out.println(l);
	l.insert(100,40);
	System.out.println(l);
	l.insert(0,35);
	System.out.println(l);
	l.insert(arg+3,38);
	System.out.println(l);
	l.insert(arg+2,37);
	System.out.println(l);
	
    }
}

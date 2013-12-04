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
	l.add(123);
	System.out.println(l);
	l.add(3,50);
	System.out.println(l);
	l.add(100,40);
	System.out.println(l);
	l.add(0,35);
	System.out.println(l);
	l.add(arg+4,38);
	System.out.println(l);
	l.add(arg+3,37);
	System.out.println(l);

	System.out.println("Third round of testing: ");
	l.remove(100);
	System.out.println(l);
	l.remove(10);
	System.out.println(l);
	l.remove(0);
	System.out.println(l);

	System.out.println("Fourth round of testing: ");
	System.out.println("Size: " + l.size());
	System.out.println(l.get(0));
	System.out.println(l.get(500));
	l.set(5,333);
	System.out.println(l);
	l.set(100,142);
	System.out.println(l);

	System.out.println("Fifth round of testing: ");
	System.out.println(l.find(333));
	System.out.println(l.find(334));
	l.add(50);
	l.add(50);
	System.out.println(l);
	l.fremove(50);
	System.out.println(l);
	l.fremove(334);
	System.out.println(l);
	
    }
}

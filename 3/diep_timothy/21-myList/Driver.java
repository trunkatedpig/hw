import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	myList l1 = new myList(10,50);
	myList l2 = new myList(10,50);
	Random r = new Random();

	System.out.println(l1);
	l1.insert(r.nextInt(10),100);
	System.out.println(l1);

	System.out.println();

	System.out.println(l2);
	l2.remove(r.nextInt(10));
	System.out.println(l2);
	
    }
}

import java.io.*;
import java.util.*;

public class Driver {
    
    public static void main(String[] args) {
	
	myList j = new myList();
	Random r = new Random();
	System.out.println(j);
	for (int i = 0; i < 10; i++) {
	    j.add(r.nextInt(10));
	}
	System.out.println(j);
	System.out.println(j.size());
	System.out.println(j.get(2));
	j.remove(5);
	System.out.println(j);
	j.set(0,14);
	System.out.println(j);
    }
}

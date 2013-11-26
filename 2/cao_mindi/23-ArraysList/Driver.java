import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args) {
	// a.add("x") increasing in powers of 10: 1, 2, 5
	//a.add(0, "x") '''': 2, 23, 2335
	//a.removes were the same for position 0 and 999
	ArrayList<Integer> a, b;
	a = new ArrayList<Integer>(10);
	for( int i = 0; i < 10; i ++){
	    a.add(i);
	}
	
	System.out.println(a);
	for (int i = 0; i < 10; i ++){
	    int x = a.get(i);
	    a.set(i, a.get(9 - i));
	    a.set(a.get(9 - i), x);
	}
	System.out.println(a);
}
}

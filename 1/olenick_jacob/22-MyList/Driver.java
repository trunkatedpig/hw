import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	myList L = new myList();
	for(int i = 0; i<10; i++){
	    L.add(i * 10);
	}
	L.add(2,20);
	// System.out.println(L);
	// L.add(2);
	// System.out.println(L);
	// L.add(3,324);
	// System.out.println(L);
	// L.remove(3);
	// System.out.println(L);
	// System.out.println(L.size());
	// System.out.println(L.get(2));
	// L.set(2,324);
	// System.out.println(L);
	System.out.println(L.find(10));
	System.out.println(L.find(11));	
	L.fremove(20);
	System.out.println(L);
	   
    }
}

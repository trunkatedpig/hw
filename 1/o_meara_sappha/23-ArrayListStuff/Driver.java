import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Integer> AL = new ArrayList<Integer>();

	// 1. Much faster to add to the back
        // for (int i = 0; i < 10000000; i ++) {
        //     AL.add(0);
        // }

        // for (int i = 0; i < 10000000; i ++) {
        //     AL.add(0, 0);
        // }
	
	// 2. Much faster to remove from the back
        // long start = System.currentTimeMillis();

        // for (int i = 0; i < AL.size(); i ++) {
        //     AL.remove(i);
        // }

	// for (int i = 1; i > AL.size(); i ++) {
	//     AL.remove(AL.size()-i);
	// }
	
        // long t = System.currentTimeMillis() - start;
        // System.out.println(t);
	
	// 3. fill ArrayList, reverse it
	ArrayList <Integer> a = new ArrayList <Integer>();
	for (int i = 0; i < 20; i ++) {
	    AL.add(i);
	}
	
	ArrayList <Integer> b = new ArrayList <Integer>(a.size());
	for (int i = 0; i < b.size() - 1; i ++) {
	    b.set(0, a.get(n));
	}

	a = b;
	System.out.println(a);
   }
}

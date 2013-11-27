import java.util.*;
import java.io.*;

public class ArrayLists {
    private ArrayList al = new ArrayList();

    public void fill(int len) {
	al = new ArrayList();
	double time = System.currentTimeMillis();
	for (int i = 0;i < len;i++) {
	    al.add("x");
	}
	System.out.println("Time for al.add(x): " + (System.currentTimeMillis() - time));
	al = new ArrayList();
	time = System.currentTimeMillis();
	for (int i = 0;i < len;i++) {
	    al.add(0,"x");
	}
	System.out.println("Time for al.add(0,x): " + (System.currentTimeMillis() - time));
    }

    public void take(int n) {
	al = new ArrayList();
	for (int i = 0;i < n;i++) {
	    al.add(0);
	}
	double time = System.currentTimeMillis();
	for (int i = 0;i < n;i++) {
	    al.remove(0);
	}
	System.out.println("Time for al.remove(0): " + (System.currentTimeMillis() - time));
	al =  new ArrayList();
	for (int i = 0;i < n;i++) {
	    al.add(0);
	}
	time = System.currentTimeMillis();
	for (int i = 1;i < n;i++) {
	    al.remove(n - i);
	}
	System.out.println("Time for al.remove(n - i): " + (System.currentTimeMillis() - time));
    }
}

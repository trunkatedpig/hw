import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	ArrayLists al = new ArrayLists();
	System.out.println("Adding 100000 elements: ");
	al.fill(100000);
	//al.add(0) was faster than al.add(0,x)
	System.out.println("Removing 100000 elements: ");
	al.take(100000);
	//al.remove(n - i) was faster than al.remove(0);
	ArrayList a = new ArrayList();
	for (int i = 0;i < 20;i++) {
	    a.add((int)(Math.random() * 10));
	}
	System.out.println("Current list: " + a);
	ArrayList rev = new ArrayList();
	for (int i = a.size();i > 0;i--) {
	    rev.add(a.get(i - 1));
	}
	System.out.println("Reversed list: " + rev);
    }
}
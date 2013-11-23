import java.util.*;
import java.io.*;

public class ArrayLists {
    private ArrayList al = new ArrayList();

    public void fill(int len) {
	double time = System.CurrentTimeMillis();
	for (int i = 0;i < len;i++) {
	    a.add("x");
	}
	System.out.println("Time for a.add(x): " + System.CurrentTimeMillis() - time);
	double time = System.CurrentTimeMillis();
	for (int i = 0;i < len;i++) {
	    a.add(0,"x");
	}
	System.out.println("Time for a.add(0,x): " + System.CurrentTimeMillis() - time);
    }

}
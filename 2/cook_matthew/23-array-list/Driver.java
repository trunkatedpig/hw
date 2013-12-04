import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	//	int arraySize = Integer .parseInt(args[0]);
	ArrayList<Object> n = new ArrayList<Object>();
	long start,t;
	int a = 2500000; 
	for (int i=0; i<a; i++) {
	    n.add(i);
	}
	start = System.currentTimeMillis();
	n.add("x");
	t = System.currentTimeMillis()-start;
	System.out.println("n.add('x'): "+t);//0


	start = System.currentTimeMillis();
	n.add(0,"x");
	t = System.currentTimeMillis()-start;
	System.out.println("n.add(0,'x'): "+t);//5

	start = System.currentTimeMillis();
	n.remove(0);
	t = System.currentTimeMillis()-start;
	System.out.println("n.remove(0): "+t);//4

	start = System.currentTimeMillis();
	n.remove(n.size()-1);
	t = System.currentTimeMillis()-start;
	System.out.println("n.remove(n.size()-1): "+t);//0
	//now doing reverse
	ArrayList<Integer> x = new ArrayList<Integer>();
	int len=100;
	for (int i=0; i<len; i++) {
            x.add(i);
        }
	System.out.println(x);
	//	System.out.println(x.get(x.size()-1));
	int help =x.size()-1;
      	for (int q=0;q<=help;q++) {
	    x.add(x.remove(help-q));
	}
	System.out.println(x);
   }

}

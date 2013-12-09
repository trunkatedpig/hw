import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	/*
	ArrayList<String> al = new ArrayList<String>();
	long start, t;
	int i = 0;
	//This was significantly faster than the other method.
	//It was finishing the whole thing in about 40 milliseconds.
	start = System.currentTimeMillis();
	while (i < 1000000) {
	    al.add("Hello");
	    i = i + 1;
	}
	t = System.currentTimeMillis()-start;
	System.out.println("Add(x) time: " + t);

	//As the number got larger, the time increased significantly
	//It took about 10000x as long as the other add method
	ArrayList<String> alist = new ArrayList<String>();
	i = 0;
	start = System.currentTimeMillis();
	while (i < 1000000) {
	    alist.add(0,"Hello");
	    i = i + 1;
	}
	t = System.currentTimeMillis()-start;
	System.out.println("Add(0,x) time: " + t);

	//This takes about the same time as the longer add method
	//so it is time consuming
	i = 0;
	start = System.currentTimeMillis();
	while (i < 1000000) {
	    al.remove(0);
	    i = i + 1;
	}
	t = System.currentTimeMillis()-start;
	System.out.println("Remove from front time: " + t);
	
	//This is ridiculously quick, able to finish remove in about 7 ms 
	i = 0;
	start = System.currentTimeMillis();
	while (i < 1000000) {
	    alist.remove(alist.size()-1);
	    i = i + 1;
	}
	t = System.currentTimeMillis()-start;
	System.out.println("Remove from back time: " + t);
	*/

	ArrayList<String> al = new ArrayList<String>();
	al.add("A");
	al.add("B");
	al.add("C");
	al.add("D");
	System.out.println(al);
	ArrayList<String> temp = new ArrayList<String>();
	for (int i = al.size()-1;i>=0;i--) {
	    temp.add(al.get(i));
	}
	al = temp;
	System.out.println(al);
    }
}
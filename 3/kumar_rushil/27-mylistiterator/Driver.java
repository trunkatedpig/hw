import java.io.*;
import java.util.*;


public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
	/*
	String s;
	ArrayList<String> al = new ArrayList<String>();
	al.add("one");
	al.add("two");
	al.add("three");
	al.add("four");
	al.add("five");
	al.add("six");
	System.out.println("ArrayList: (iterator): "+al);
	Iterator<String> it = al.iterator();
	while (it.hasNext()){
	    s=it.next();
	    System.out.println("ArrayList (iterator): "+s);
	}
	System.out.println();
	*/
	String s1 = "";
	myList ml = new myList();
	ml.add(20);
	ml.add(50);
	ml.add(15);
	ml.add(8);
	System.out.println(ml);
	Iterator<Integer> mlit = ml.iterator();
	while (mlit.hasNext()){
	    s1 = mlit.next() + "";
	    System.out.println("myList (iterator): "+s1);
	}
    }
}

import java.io.*;
import java.util.*;


public class Driver {
    public static void main(String[] args){

		System.out.println();
		System.out.println("*-* Testing class myList*-*");
		System.out.println();

		String s;
		ArrayList<String> al = new ArrayList<String>();

		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
		al.add("six");
		System.out.println("ArrayList: "+al);
		System.out.println();

		System.out.println("ArrayList using Iterator");
		Iterator<String> it = al.iterator();
		while (it.hasNext()){
		    s=it.next();
		    System.out.println("ArrayList (iterator): "+s);
		}
		System.out.println();

		int i;
		myList ml = new myList();

		ml.add(20);
		ml.add(50);
		ml.add(15);
		ml.add(8);
		System.out.println("MyList: " +ml);
		System.out.println();

		System.out.println("MyList using Iterator");
		Iterator<Integer> mlit = ml.iterator();
		while(mlit.hasNext()){
			i=mlit.next();
			System.out.println("MyList (iterator): "+ i);
		}


    	}
}
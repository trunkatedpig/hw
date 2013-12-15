import java.util.*;
import java.io.*;

public class Driver {

    public static void main(String[] args) throws FileNotFoundException {
	String s;

        /*
	ArrayList<String> al = new ArrayList<String>();
	al.add("one");
	al.add("two");
	al.add("three");
	al.add("four");
	al.add("five");
	al.add("six");
	System.out.println("ArrayList (iterator) " + al);
	Iterator<String> it = al.iterator();
	while (it.hasNext()) {
	    s = it.next();
	    System.out.println("al: " + s);
	}
	System.out.println();
        */

	myList ml = new myList();
	ml.add(20);
	ml.add(50);
	ml.add(12);
	ml.add(13);
	System.out.println(ml);
        Iterator<Integer> mlit = ml.iterator();
        while(mlit.hasNext()) {
            int i = mlit.next();
            System.out.println("ml: " + i);
        }
    }
}

import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
	String s;

	/*	System.out.println("Scanner:");
	Scanner sc = new Scanner(new File("data"));
	while (sc.hasNext()) {
	    s=sc.next();
	    System.out.println("File: "+s);
	}
	System.out.println();

	ArrayList<String> AL = new ArrayList<String>();
	AL.add("one");
	AL.add("two");
	AL.add("three");
	AL.add("four");
	AL.add("five");
	AL.add("six");

	System.out.println("ArrayList (get) "+AL);
	int i=0;
	while (i<AL.size()) {
	    s = AL.get(i);
	    System.out.println("AL: "+s);
	    i=i+1;
	}
	System.out.println();

	System.out.println("ArrayList (iterator) "+AL);
	Iterator<String> it = AL.iterator();
	while (it.hasNext()) {
	    s = it.next();
	    System.out.println("AL: "+s);
	    i=i+1;
	}
	System.out.println();
*/
	myList mli = new myList();
	mli.add(75);
	mli.add(68);
	mli.add(34);
	mli.add(109);
	System.out.println(mli);
	Iterator<Integer> mlit = mli.iterator();
	while (mlit.hasNext()) {
	    System.out.println(mlit.next());
	}
	
    }

}

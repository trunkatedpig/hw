import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	MyList l = new MyList();
	Random r = new Random();
	int i = r.nextInt(l.size()-1);
	System.out.println("MyList 1");
	System.out.println("Removing index " + i + " from our list--->");
	System.out.println("List before:" + l.toString());
	System.out.println("Value removed:" + l.remove(i));
	System.out.println("List after:" + l.toString());
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("MyList 2: Electric Boogaloo");
	int z = r.nextInt(l.size()-1);
	String p = "Isabella";
	System.out.println("Inserting "+ p+ " into our list at index "+ z+ "--->");
	System.out.println("List before:" + l.toString());
	l.add(z,p);
	System.out.println("List after:" + l.toString());
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("MyList in 3D");
	String w = l.getA()[r.nextInt(l.size()-1)];
	System.out.println("Removing the first occurance of " + w + " from our list--->");
	System.out.println("List before:" + l.toString());
	l.fremove(w);
	System.out.println("List after:" + l.toString());
    }
}

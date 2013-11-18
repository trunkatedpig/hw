import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	MyList l = new MyList();
	Random r = new Random();
	int i = r.nextInt(20);
	System.out.println("Removing index " + i + " from our list");
	System.out.println("List before:" + l.toString());
	System.out.println("Value removed:" + l.remove(i));
	System.out.println("List after:" + l.toString());
    }
}

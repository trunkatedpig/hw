import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	MyList a = new MyList();

	a.add(6);
	System.out.println(a);

	a.add(1,9);
	System.out.println(a);
	
	a.add(8);
	a.add(8);
	a.add(8);
	System.out.println(a);

	a.remove(5);
	System.out.println(a);
	
	System.out.println("-------------------");

	System.out.println(a.find(6));
	
	a.fremove(8);
	System.out.println(a);
    }	    
}
	    

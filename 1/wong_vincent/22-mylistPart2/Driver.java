import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	MyList a = new MyList();

	a.add(2,9);
	System.out.println(a);

	a.remove(5);
	System.out.println(a);
    }	    
}
	    

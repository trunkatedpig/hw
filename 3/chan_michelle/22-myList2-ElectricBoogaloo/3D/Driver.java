import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	myList test = new myList();
	System.out.println(test);
	test.add(2,10);
	System.out.println(test);
	test.remove(2);
	System.out.println(test);
    

	myStringList test2 = new myStringList();
        System.out.println(test2);
	test2.add(3,"poo");
	System.out.println(test2);
        test2.remove(3);
	System.out.println(test2);
    }
}
	

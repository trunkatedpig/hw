import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) { 
    	myList l1 = new myList();
    	l1.fill();

    	System.out.println("The initial list:");
    	System.out.println(l1);

    	System.out.println("List after removing index 2:");
    	System.out.println("Item removed:" + l1.remove(2));
    	System.out.println(l1);

    	System.out.println("List after inserting 4 at position 1:");
    	l1.insert(1,4);
    	System.out.println(l1);
    }

}

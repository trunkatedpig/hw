import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	myList m = new myList();
	System.out.println("Data: " + m.toString());
	m.add(0,1);
	m.add(4,3);
	m.add(7,7);
	System.out.println("Data after adding into position 0 : 1, position 4 : 3, and position 7 : 7: " + m.toString());
	m.remove(3);
	m.remove(1);
	System.out.println("Data after removing pos 1 and 3 " + m.toString());
	System.out.println("Size: " + m.size());
        System.out.println("Item at pos 2: " + m.get(2));
    }
}
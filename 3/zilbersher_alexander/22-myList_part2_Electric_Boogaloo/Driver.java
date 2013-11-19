import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	myList m = new myList();
	m.add(0,1);
	m.add(1,3);
	m.add(2,7);
	m.add(3,45);
	m.add(4,8);
	m.add(5,12);
	System.out.println("Data after adding into each position 1, 3, 7, 45, 8 and 12: " + m.toString());
	m.remove(3);
	m.remove(1);
	System.out.println("Data after removing pos 1 and 3 " + m.toString());
	System.out.println("Size: " + m.size());
        System.out.println("Item at pos 2: " + m.get(2));
    }
}
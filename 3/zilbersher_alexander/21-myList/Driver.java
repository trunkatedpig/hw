import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	myList m = new myList();
	m.insert(0,1);
	m.insert(1,3);
	m.insert(2,7);
	m.insert(3,45);
	m.insert(4,8);
	m.insert(5,12);
	System.out.println("Data after inserting into each position 1, 3, 7, 45, 8 and 12: " + m.toString());
	m.remove(3);
	m.remove(1);
	System.out.println("Data after removing pos 1 and 3 " + m.toString());
    }
}
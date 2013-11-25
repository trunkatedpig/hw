import java.io.*;
import java.util.*;

public class StringDriver{
    public static void main(String[] args) {
	myStringList m = new myStringList();
	System.out.println("Data: " + m.toString());
	m.add(0,"wasa");
	m.add(4,"mumu");
	m.add(7,"jeffrey");
	System.out.println("Data after adding into position 0 : wasa, position 4 : mumu, and position 7 : jeffrey: " + m.toString());
	m.remove(3);
	m.remove(1);
	System.out.println("Data after removing pos 1 and 3 " + m.toString());
	System.out.println("Size: " + m.size());
        System.out.println("Item at pos 2: " + m.get(2));
	System.out.println("Find mumu: " + m.find("mumu"));
	m.fremove("mumu");
	System.out.println("Data after removing the first mumu: " + m.toString());
    }
}
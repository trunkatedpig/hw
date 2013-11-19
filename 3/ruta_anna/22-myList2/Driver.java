import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	System.out.println();
	System.out.println("*-* Testing class myList *-*");
	System.out.println();

	myList L = new myList();

	System.out.println("Array L:");
	System.out.println(L);
	System.out.println();

	System.out.println("Modify Array L to count up by Fives (start from 5):");
	for (int i = 0; i<5;i++) {
		    L.add((i+1)*5);
	}
	System.out.println(L);
	System.out.println();

	System.out.println("Add 5 additional elements to Array L, which continue pattern:");
	for (int i = 0; i<5;i++) {
		    L.add(25+(i+1)*5);
	}
	System.out.println(L);
	System.out.println();

	System.out.println("Remove element at position(index) 4 of Array L:");
	System.out.println("The value of the removed element: " + L.remove(4));
	System.out.println(L);
	System.out.println();

	System.out.println("Insert element 25 at position(index) 4 of Array L:");
	L.insert(4,25);
	System.out.println(L);
	System.out.println();

	System.out.println("Change the value of element at position 5 to 100 in Array L:");
	L.set(5,100);
	System.out.println(L);
	System.out.println("The value of the element at position 5: " + L.get(5));
	System.out.println();

	System.out.println("The size of Array L: " + L.size());
	System.out.println();

	}
}
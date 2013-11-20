//Andrew Fischer period 2 w/ Sam Kim


import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        myList L = new myList();
	System.out.println("List Creation:");
        System.out.println(L);

        for (int i = 0; i < 5; i++) {
            L.add((i + 1) * 10);
        }
        System.out.println(L);

        for (int i = 0; i < 7; i++) {
            L.add((i + 1) * 10);
        }
        System.out.println(L);



	
        System.out.println("Add 2 to pos 4");
        L.add(2, 4);
        System.out.println(L);
        System.out.println("Remove pos 2");
        L.remove(2);
        System.out.println(L);
        System.out.println("Size of L");
	L.size();
	System.out.println("Where is 2?");
        L.get(2);
	System.out.println("Set 2 to spot 100.");
        L.set(2, 100);
        System.out.println(L);        
	System.out.println("Find a 2");
	L.find(20);
	System.out.println(L);
	System.out.println("Find and remove a 2");
	L.fremove(20);
	System.out.println(L);
    }        
}

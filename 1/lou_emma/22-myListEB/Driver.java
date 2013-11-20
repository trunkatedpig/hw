import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        myList L = new myList();
		
        for (int i=0;i<12;i++) {
            L.add(i*10);
        }

        System.out.println(L);
		
		System.out.println("---------------");

		L.add(3, 25);
		
		System.out.println(L);
		System.out.println("---------------");
		
		L.remove(6);
		System.out.println(L);
		
		L.set(4, 23543);
		System.out.println(L);
    }


}
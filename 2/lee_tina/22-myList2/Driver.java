import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	myList L = new myList();

       System.out.println(L);
	for (int i = 0; i<5;i++) {
	    L.add((i+1)*5);
	}
	System.out.println(L);
	/*
	for (int i = 0; i<7;i++) {
	    L.add((i+1)*5);
	}
	System.out.println(L);
	*/
	/*System.out.println(L);
	L.insert(4,6);
	System.out.println(L);
	L.insert(2,3);
	System.out.println(L);
	L.insert(8,4);
	System.out.println(L);
	*/
	System.out.println("-------------------------------");
	System.out.println(L);
	L.add(4,6);
	System.out.println(L);
	L.add(2,3);
	System.out.println(L);
	L.add(8,4);
	System.out.println(L);
	System.out.println("-------------------------------");
	System.out.println(L);
	L.remove(3);
	System.out.println(L);
	L.remove(15);
	System.out.println(L);
	System.out.println("-------------------------------");
	System.out.println(L.size());
	System.out.println(L);
	System.out.println(L.get(5));
	System.out.println(L.get(14));
	System.out.println("-------------------------------");
	System.out.println(L);
	System.out.println(L.set(4,44));
	System.out.println(L);
	System.out.println(L.set(20,2));
	System.out.println(L);

	System.out.println("-------------------------------");
	System.out.println(L);
	System.out.println(L.find(44));
	System.out.println(L.find(64));
	System.out.println("-------------------------------");
	System.out.println(L);
	L.fremove(44);
	System.out.println(L);
	L.fremove(63);
	System.out.println(L);
    }	


}

import java.io.*;
import java.util.*;
public class Driver {
    public static void main(String[] args) {
	

	myList L=new myList();
	myList L1=new myList();
	
	
	for (int i = 0; i<5;i++) {
	    L.add((i+1)*6);
	}
	for (int i = 0; i<5;i++) {
	    L1.add((i+1)*6);
	}
	
	System.out.println("Printing L");
	System.out.println(L);
	System.out.println("Printing L1");
	System.out.println(L1);
	/*
	System.out.println(L);

	for (int i = 0; i<7;i++) {
	    L.add((i+1)*5);
	}
	System.out.println(L);
	*/
	
	System.out.println("<---------------------------->");
	
        L.add(3,999);
	System.out.println(L);
	 L1.add(3,999);
	 System.out.println(L1);
    }	
	
	


}

import java.io.*;
import java.util.*;
public class Driver {
    public static void main(String[] args) {
	

	myList L=new myList();
	myList L1=new myList();
	myList L2=new myList();
	myStringList S=new myStringList();
	
	
	for (int i = 0; i<5;i++) {
	    L.add((i+1)*6);
	}
	for (int i = 0; i<5;i++) {
	    L1.add((i+1)*6);
	}
	for (int i = 0; i<10;i++) {
	    L2.add((i+1)*6);
	}
	for (int i = 0; i<5;i++) {
		
	    S.add(i,"hello");
	}
	
	System.out.println("Printing L");
	System.out.println(L);
	System.out.println("Printing L1");
	System.out.println(L1);
		
	System.out.println("<---------------------------->");
	
    L.add(3,999);
	System.out.println(L);
	 L1.add(3,999);
	 System.out.println(L1);
	 System.out.println("<---------------------------->");
	 System.out.println(L1.find(999));
	 System.out.println("<---------------------------->");
	 System.out.println("testing fremove");
	 System.out.println("before fremove");
	 System.out.println(L2);
	 System.out.println("after fremove");
	 L2.fremove(36);
	 System.out.println(L2);
	 System.out.println("<---------------------------->"); 
	System.out.println("Printing S");
	System.out.println(S);
	System.out.println(S.size());
	 
    }	
	
	


}

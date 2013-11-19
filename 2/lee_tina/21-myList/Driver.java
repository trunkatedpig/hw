import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	myList L = new myList();

	/*System.out.println(L);
	for (int i = 0; i<5;i++) {
	    L.add((i+1)*5);
	}
	System.out.println(L);

	for (int i = 0; i<7;i++) {
	    L.add((i+1)*5);
	}
	System.out.println(L);
	*/
	System.out.println(L);
	L.insert(4,6);
	System.out.println(L);
	L.insert(2,3);
	System.out.println(L);
	L.insert(8,4);
	System.out.println(L);
    }	


}

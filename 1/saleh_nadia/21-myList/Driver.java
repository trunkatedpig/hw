import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	myList L = new myList();
	for(int i = 0; i<15; i++){
	    L.add(i * i);
	}
	System.out.println(L);
	L.remove(3);
	System.out.println(L);	
    }
}

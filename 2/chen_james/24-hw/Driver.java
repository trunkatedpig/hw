import java.io.*;
import java.util.*;
public class Driver {
    public static void main(String[] args) {
	

	ArrayLists L=new ArrayLists();
	long start,t;
	
	
	System.out.println("add at beginning");
	start = System.currentTimeMillis();
	

	for (int i = 0; i<10;i++) {
	    L.add("100");
	}

	t = System.currentTimeMillis()-start;
	System.out.println("Constructor time: "+t);


	

	
	
    }

}
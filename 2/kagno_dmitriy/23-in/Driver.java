import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> al = new ArrayList<Integer>();
	ArrayList<Integer> a2 = new ArrayList<Integer>();
        long timeNow = System.currentTimeMillis();
      	for(int i = 0; i < 90 /*9000*/;i++){
	    al.add(0,i);
	}
	System.out.println(System.currentTimeMillis() - timeNow);

	timeNow = System.currentTimeMillis();
	for(int i = 0; i < 90/*90000*/;i++){
	    a2.add(i);
	}
	System.out.println(System.currentTimeMillis() - timeNow);

	//al == 2301 milli
	//a2 == 5 milli
	
	
	
	Array A = new Array();
	A.reverse(al);
	A.reverse(a2);
	System.out.println(A.printArray());
	System.out.println(A.printArray());
	
        timeNow = System.currentTimeMillis();
	for(int i = 0; i < 90 /*90000*/;i++){
	    al.remove(0);
	}
	System.out.println(System.currentTimeMillis() - timeNow);
	
	timeNow = System.currentTimeMillis();
	for(int i = 0; i < 90/*90000*/;i++){
	    a2.remove(a2.size()-1);
	}
	System.out.println(System.currentTimeMillis() - timeNow);
	
	//a1 == 2340milli
	//a2 == 1 milli

	
	
    }
}

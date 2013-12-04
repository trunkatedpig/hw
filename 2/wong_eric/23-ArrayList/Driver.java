import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){
      
	ArrayList<Integer> a = new ArrayList<Integer>();
	long start, end;
	int x = 500000;
	Random r = new Random();

	/*
	start = System.currentTimeMillis();
	for (int i=0; i<x; i++){
	    a.add(5);
	}
	end = System.currentTimeMillis() - start;
	System.out.println(end);

	start = System.currentTimeMillis();
	for (int i=0; i<x; i++){
	    a.add(0,5);
	}
	end = System.currentTimeMillis() - start;
	System.out.println(end);


	start = System.currentTimeMillis();
	for (int i=0; i<x; i++){
	    a.remove(0);
	}
	end = System.currentTimeMillis() - start;
	System.out.println(end);

	start = System.currentTimeMillis();
	for (int i=0; i<x; i++){
	    a.remove(a.size()-1);
	}
	end = System.currentTimeMillis() - start;
	System.out.println(end);
	*/

	for (int i=0; i<x; i++) {
	    a.add(r.nextInt(100));
	}

	int size = a.size()-1;
	ArrayList<Integer> temp = new ArrayList<Integer>();
	start = System.currentTimeMillis();
	for (int i=size; i>0; i--){
	    int add = a.get(i);
	    temp.add(add);
	}
	a = temp;
	end = System.currentTimeMillis() - start;
	System.out.println(end);

    }
}
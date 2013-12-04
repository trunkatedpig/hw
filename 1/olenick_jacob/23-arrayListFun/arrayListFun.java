import java.util.*;
import java.io.*;

public class arrayListFun{
    public static void main(String[] args){

	System.out.println("adding to end");

	ArrayList<Integer> A = new ArrayList<Integer>(0);
	long a = System.currentTimeMillis();
	for(int i = 0; i < 100; i ++){
	    A.add(i);
	}
	System.out.println(System.currentTimeMillis() - a);

	ArrayList<Integer> B = new ArrayList<Integer>(0);
	long b = System.currentTimeMillis();
	for(int i = 0; i < 1000; i ++){
	    B.add(i);
	}
	System.out.println(System.currentTimeMillis() - b);

	ArrayList<Integer> C = new ArrayList<Integer>(0);
	long c = System.currentTimeMillis();
	for(int i = 0; i < 10000; i ++){
	    C.add(i);
	}
	System.out.println(System.currentTimeMillis() - c);	

	ArrayList<Integer> D = new ArrayList<Integer>(0);
	long d = System.currentTimeMillis();
	for(int i = 0; i < 100000; i ++){
	    D.add(i);
	}
	System.out.println(System.currentTimeMillis() - d);


	System.out.println("Adding to beginning");

	
	ArrayList<Integer> E = new ArrayList<Integer>(0);
	long ee = System.currentTimeMillis();
	for(int i = 0; i < 100; i ++){
	    E.add(0,i);
	}
	System.out.println(System.currentTimeMillis() - ee);

	ArrayList<Integer> F = new ArrayList<Integer>(0);
	long f = System.currentTimeMillis();
	for(int i = 0; i < 1000; i ++){
	    F.add(0,i);
	}
	System.out.println(System.currentTimeMillis() - f);

	ArrayList<Integer> G= new ArrayList<Integer>(0);
	long g = System.currentTimeMillis();
	for(int i = 0; i < 10000; i ++){
	    G.add(0,i);
	}
	System.out.println(System.currentTimeMillis() - g);

	ArrayList<Integer> H = new ArrayList<Integer>(0);
	long h = System.currentTimeMillis();
	for(int i = 0; i < 100000; i ++){
	    H.add(0,i);
	}
	System.out.println(System.currentTimeMillis() - h);


	System.out.println("removing from end");
	
	a = System.currentTimeMillis();
	for(int i = 100; i > 0; i --){
	    A.remove(i);
	}
	System.out.println(System.currentTimeMillis() - a);

	b = System.currentTimeMillis();
	for(int i = 1000; i > 0; i --){
	    B.remove(i);
	}
	System.out.println(System.currentTimeMillis() - b);

	c = System.currentTimeMillis();
	for(int i = 10000; i > 0; i --){
	    C.remove(i);
	}
	System.out.println(System.currentTimeMillis() - c);

	d = System.currentTimeMillis();
	for(int i = 100000; i > 0; i --){
	    D.remove(i);
	}
	System.out.println(System.currentTimeMillis() - d);

		
    }
}
import java.util.*;
import java.io.*;

public class Compare{
    public static void main(String[] args){
	ArrayList<String> a = new ArrayList<String>();
	/*
	for (int i = 0; i < 100000000; i++)
	    a.add("y");
	double time1 = System.currentTimeMillis();
	a.add(0,"x");
	System.out.println(System.currentTimeMillis() - time1);
	a.remove(0);
	time1=System.currentTimeMillis();
	a.add("x");
	System.out.println(System.currentTimeMillis() - time1);
	*/
	double time1 = System.currentTimeMillis();
	for (int i = 0; i <100000; i++)
	    a.add(0,"x");
	System.out.println(System.currentTimeMillis()-time1);
	time1 = System.currentTimeMillis();
	for (int i = 0; i <100000; i++)
	    a.remove(0);
	System.out.println(System.currentTimeMillis()-time1);
	time1=System.currentTimeMillis();
	for (int i = 0; i <100000; i++)
	    a.add("x");
	System.out.println(System.currentTimeMillis()-time1);
	time1=System.currentTimeMillis();
	for (int i = 0; i <100000; i++)
	    a.remove(a.size()-1);
	System.out.println(System.currentTimeMillis()-time1);

    }
}

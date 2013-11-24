import java.io.*;
import java.util.*;

//tests on 100 - 1,000,000 by powers of 10

//add()
//0.0
//0.0
//2.0
//14.0
//29.0

//add(at end)
//0.0
//0.0
//5.0
//18.0
//42.0

//add(at beginning)
//1.0
//1.0
//49.0
//2899.0
//

public class Driver {

    public static void main(String[] args) {
	double t1 = System.currentTimeMillis();
	ArrayList<String> rebecca = new ArrayList<String>();
	for(int i = 0; i<100; i++)
	    rebecca.add(0,"x");
	double t2 = System.currentTimeMillis();
	System.out.println(t2 - t1);

	t1 = System.currentTimeMillis();
	ArrayList<String> a = new ArrayList<String>();
	for(int i = 0; i<1000; i++)
	    a.add(0,"x");
	t2 = System.currentTimeMillis();
	System.out.println(t2 - t1);

	t1 = System.currentTimeMillis();
	ArrayList<String> b = new ArrayList<String>();
	for(int i = 0; i<10000; i++)
	    b.add(0,"x");
	t2 = System.currentTimeMillis();
	System.out.println(t2 - t1);

	t1 = System.currentTimeMillis();
	ArrayList<String> c = new ArrayList<String>();
	for(int i = 0; i<100000; i++)
	    c.add(0,"x");
	t2 = System.currentTimeMillis();
	System.out.println(t2 - t1);


	t1 = System.currentTimeMillis();
	ArrayList<String> d = new ArrayList<String>();
	for(int i = 0; i<1000000; i++)
	    d.add(0,"x");
	t2 = System.currentTimeMillis();
	System.out.println(t2 - t1);

    }   

}
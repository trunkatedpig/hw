import java.io.*;
import java.util.*;


public class Driver{
    public static void main (String[] args){

	long start,t;

        CompareStuff c1 = new CompareStuff(0);
	CompareStuff c2 = new CompareStuff(0);

	System.out.println(c1.getStuff());
	System.out.println(c2.getStuff());
	
	System.out.print("a.add('x') vs a.add(0,'x') for 100 Items: " );
	start = System.currentTimeMillis();
	c1.addme(100);
	t = System.currentTimeMillis()-start;
	System.out.print(t);
	
        start = System.currentTimeMillis();
	c2.addme2(100);
	t = System.currentTimeMillis()-start;
	System.out.print(" " + t + "\n");

	System.out.print("a.add('x') vs a.add(0,'x') for 1000 Items: " );
        start = System.currentTimeMillis();
	c1.addme(1000);
	t = System.currentTimeMillis()-start;
	System.out.print(t);
	
        start = System.currentTimeMillis();
	c2.addme2(1000);
        t = System.currentTimeMillis()-start;
	System.out.print(" " + t + "\n");

	System.out.print("a.add('x') vs a.add(0,'x') for 10000 Items: " );
        start = System.currentTimeMillis();
	c1.addme(10000);
	t = System.currentTimeMillis()-start;
	System.out.print(t);
	
        start = System.currentTimeMillis();
	c2.addme2(10000);
        t = System.currentTimeMillis()-start;
	System.out.print(" " + t + "\n");

 	System.out.print("a.add('x') vs a.add(0,'x') for 100000 Items: " );
        start = System.currentTimeMillis();
	c1.addme(100000);
	t = System.currentTimeMillis()-start;
	System.out.print(t);
	
        start = System.currentTimeMillis();
	c2.addme2(100000);
        t = System.currentTimeMillis()-start;
	System.out.print(" " + t + "\n");

	System.out.println();
	

	CompareStuff c3 = new CompareStuff(111100);
	CompareStuff c4 = new CompareStuff(111100);

	System.out.print("a.remove beginning vs a.remove end for 100 Items: " );
	start = System.currentTimeMillis();
	c3.removeme(100);
	t = System.currentTimeMillis()-start;
	System.out.print(t);
	
        start = System.currentTimeMillis();
	c4.removeme2(100);
	t = System.currentTimeMillis()-start;
	System.out.print(" " + t + "\n");

        System.out.print("a.remove beginning vs a.remove end for 1000 Items: " );
	start = System.currentTimeMillis();
	c3.removeme(1000);
	t = System.currentTimeMillis()-start;
	System.out.print(t);
	
        start = System.currentTimeMillis();
	c4.removeme2(1000);
	t = System.currentTimeMillis()-start;
	System.out.print(" " + t + "\n");

	System.out.print("a.remove beginning vs a.remove end for 10000 Items: " );
	start = System.currentTimeMillis();
	c3.removeme(10000);
	t = System.currentTimeMillis()-start;
	System.out.print(t);
	
        start = System.currentTimeMillis();
	c4.removeme2(10000);
	t = System.currentTimeMillis()-start;
	System.out.print(" " + t + "\n");

	System.out.print("a.remove beginning vs a.remove end for 100000 Items: " );
	start = System.currentTimeMillis();
	c3.removeme(100000);
	t = System.currentTimeMillis()-start;
	System.out.print(t);
	
        start = System.currentTimeMillis();
	c4.removeme2(100000);
	t = System.currentTimeMillis()-start;
	System.out.print(" " + t + "\n");

	System.out.println(c3.getStuff());
	System.out.println(c4.getStuff());

	CompareStuff c5 = new CompareStuff(10);
	System.out.println(c5.getStuff());
	System.out.println(c5.reverseme());
    }
}

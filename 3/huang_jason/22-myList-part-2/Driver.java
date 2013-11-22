import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){

        myList l1, l2, l3;

	l1 = new myList(12,24);

	System.out.println(l1.size());

        System.out.println(l1);
        l1.add(7,12);
        System.out.println(l1);

	System.out.println(l1.get(8));
	l1.set(8,10);
	System.out.println(l1.get(8));

	l1.remove(4);
	System.out.println(l1);
	System.out.println(l1.size());
        
        l2 = new myList();

	System.out.println(l2.size());

        System.out.println(l2);
        l2.add(5,14);
	System.out.println(l2);
	
	System.out.println(l2.get(2));
	l2.set(2,16);
	System.out.println(l2.get(2));
	
	l2.remove(1);
	System.out.println(l2);
	System.out.println(l2.size());

	l3 = new myList(8,2);
	
	System.out.println(l3);
	System.out.println(l3.find(1));
	System.out.println(l3.find(3));
	
	l3.fremove(1);
	System.out.println(l3);
	l3.fremove(3);
	System.out.println(l3);
    }
}
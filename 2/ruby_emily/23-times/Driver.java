import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	ArrayList<String> a= new ArrayList<String>();
	ArrayList<String> b=new ArrayList<String>();

	//comparing adds
	long start=System.currentTimeMillis();
	for (int i=0;i<100000;i++){
	    a.add(0,"x");
	}
	long end=System.currentTimeMillis();
	System.out.println("Adding to beginning " +(end-start));

	start=System.currentTimeMillis();
	for (int i=0;i<100000;i++){
	    b.add("x");
	}
	end=System.currentTimeMillis();
	System.out.println("Adding to the end " + (end-start));


	//comparing removes
	start=System.currentTimeMillis();
	for (int i=0;i<a.size();i++){
	    a.remove(0);
	}
	end=System.currentTimeMillis();
	System.out.println("Removing from beginning "+ (end-start));

	start=System.currentTimeMillis();
	for (int i=0;i<a.size();i++){
	    b.remove("x");
	}
	end=System.currentTimeMillis();
	System.out.println("Removing from end "+ (end-start));

	
	//part 3
	ArrayList<Integer> c=new ArrayList<Integer>();
	Random r=new Random();
	for (int i=0;i<10;i++){
	    c.add(r.nextInt(100));
	}
	System.out.println(c);

	int i;
        ArrayList<Integer> temp=new ArrayList<Integer>();
        for (i=0;i<c.size();i++){
	    temp.add(0,c.get(i));
	}
        c=temp;
	System.out.println(c);
	
    }
}
//adding to the beginning takes much longer, its 6795 to 2
//removing from the beginning takes barely longer, 5345 to 4820

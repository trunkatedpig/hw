import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){
	Random r = new Random();
	ArrayList<Integer> a = new ArrayList<Integer>();
	ArrayList<Integer> b = new ArrayList<Integer>();
     
	long start = System.currentTimeMillis();
	for(int i=0;i<10000;i++)
	    a.add(r.nextInt(2000));
	long end = System.currentTimeMillis();
	System.out.println("normal add time: " + (end - start));

	long start2 = System.currentTimeMillis();
	for(int i=0;i<10000;i++)
	    a.add(i,r.nextInt(2000));
	long end2 = System.currentTimeMillis();
	System.out.println("position add time: " + (end2 - start2));
	
	//Normal add time is shorter
	
	start = System.currentTimeMillis();
	start2 = System.currentTimeMillis();
	end = System.currentTimeMillis();
	end2 = System.currentTimeMillis();
	for(int i=0;i<10000;i++)
	    a.remove(0);
    
	System.out.println("normal remove time: " + (end - start));
	
	for (int i=0;i<10000;i++)
	    a.remove("x");

	System.out.println("position remove time: " + (end2 - start2));
	//Position remove time is shorter

        public void reverse() {
	    ArrayList<Integer> temp = new ArrayList<Integer>();
	    for (int i = a.size() - 1; i >= 0; i--) {
                temp.add(a.get(i));
	    }
	    a = temp;
        }        
    }
}

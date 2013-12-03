import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	/* Part 1
	   ArrayList<Integer> front = new ArrayList<Integer>();
	ArrayList<Integer> back = new ArrayList<Integer>();
	long start = System.currentTimeMillis();

	Adding to back is faster than adding to the front
	for (int i=0; i  < 100000;i++){
	    front.add(0,i);
	}
	System.out.println("Adding to front"+ (System.currentTimeMillis()- start));
	start = System.currentTimeMillis();
	for (int i = 0;i < 100000;i++){
	    back.add(i);
	}
	System.out.println("Adding to back: "+(System.currentTimeMillis()-start)) ;

	Part 2
	Removing from the back was also faster than removing from the front
	start = System.currentTimeMillis();
	for (int i = 0; i < front.size();i++){
	    front.remove(0);
	}
	System.out.println("Removing from front: " + (System.currentTimeMillis()-start));

	start = System.currentTimeMillis();
	for(int i = 0; i < back.size();i++){
	    back.remove(back.size()-1);
	}
	System.out.println("Removing from the back: "+ (System.currentTimeMillis()- start));
    
	Part 3*/
	ArrayList<Integer> newarray = new ArrayList<Integer>();
	for (int i = 0; i < 10; i ++){
	    newarray.add(i);
	}
	System.out.println(newarray);

	ArrayList<Integer> temp = new ArrayList<Integer>();
	for (int i = newarray.size()-1;i >=0; i --){
	    temp.add(newarray.get(i));
	}
	newarray= temp;

	System.out.println(newarray);
    }
}

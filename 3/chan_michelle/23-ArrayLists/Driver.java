import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args){
	//Part 1
	ArrayList<String> beginning = new ArrayList<String>();
	ArrayList<String> end = new ArrayList<String>();
	ArrayList<Integer> intArray = new ArrayList<Integer>();

	long start = System.currentTimeMillis();
	for (int i = 0; i < 1000000; i ++){
	    beginning.add(0,"x");
	}
	System.out.println("Time add beginning: " + (System.currentTimeMillis() - start));

	start = System.currentTimeMillis();
	for (int i = 0; i < 1000000; i ++){
	    end.add("x");
	System.out.println("Time add end: " + (System.currentTimeMillis() - start));


	//Part 2
	start = System.currentTimeMillis();
	while (beginning.size() > 0){
	    beginning.remove(0);
	}
	System.out.println("Time remove beginning: " + (System.currentTimeMillis() - start));

	start = System.currentTimeMillis();
	while (end.size() > 0){
	    end.remove(end.size() -1);
	}
	System.out.println("Time remove end: " + (System.currentTimeMillis() - start));


	//Part 3
	for(int y = 0; y < 8; y ++){
	    intArray.add(y);
	}
	ArrayList<Integer> temp = new ArrayList<Integer>();
	for (int y = intArray.size() -1; y >= 0; y--){
	    temp.add(intArray.get(y));
	}
	System.out.println(intArray.toString());
	System.out.println(temp.toString());
	}
    }
}

//this took a super long time to run in the command prompt
//so I got impatient and did not wait anymore
//so I do not know the time results

import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String[] args){
	//Adding to the End was almost instantenous
	//Adding and Removing from the Front was a slightly slower, but took almost the same time
	//Removing from the End took the longest, exponential increase?


	ArrayList<Integer> a = new ArrayList<Integer>();
	for (int z = 1; z <= 10; z++){
	    a.add(z);
	}
	System.out.println(a);


	//Reverse
	ArrayList<Integer> temp = new ArrayList<Integer>();
	for (int i = a.size()-1; i >=0; i--){
	    temp.add(a.get(i));
	}
	a = temp;

	System.out.println(a);

    }
}

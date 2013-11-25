import java.util.*;
import java.io.*;

//Adding at the beginning was already 3s at 100000 (at the end was only .07s) and breaks at 1000000
//Adding at the end was only .6s at 10000000 and at 100000000 you get a "heap" error
//Removing from the end was only .047s at 10000000 and at 100000000 you get a "heap" error
//Removing from the beginning was 2s at 100000 but breaks at 1000000

public class ArrayLists{
    public void test(int n){
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		long start=System.currentTimeMillis();
		for (int i=0;i<n;i++)
		    a.add("yolo");
		long end=System.currentTimeMillis();
		System.out.println(end-start + ": for adding to the end of an ArrayList");
		
		// long start2=System.currentTimeMillis();
		// for (int i=0;i<n;i++)
		// 	a2.add(0, "yolo");
		// long end2=System.currentTimeMillis();
		// System.out.println(end2-start2 + ": for adding to the beginning of an ArrayList");

		// long start3=System.currentTimeMillis();
		// for (int i=n;i>0;i--)
		//     a.remove(i);
		// long end3=System.currentTimeMillis();
		// System.out.println(end3-start3 + ": for deleting from the end of an ArrayList");

		long start3=System.currentTimeMillis();
		for (int i=0;i<a.size();i++)
		    a.remove(i);
		long end3=System.currentTimeMillis();
		System.out.println(end3-start3 + ": for deleting from the beginning of an ArrayList");

	    }
	    
	public static void main(String[] args){
		ArrayLists A = new ArrayLists();
		A.test(1000000);
    }
}
import java.io.*;
import java.util.*;

public class ArrayLists{
    public static void main(String[] args){
	ArrayList<Integer> a = new ArrayList<Integer>(100000);

	/*
	long t1 = System.currentTimeMillis();
	a.add(0);
	long t2 = System.currentTimeMillis();
	System.out.print("Add: ");
	System.out.println(t2 - t1);
	add doesn't matter
	*/

	long t1 = System.currentTimeMillis();
	a.add(0,0);
	long t2 = System.currentTimeMillis();
	System.out.print("Add at start: ");
	System.out.println(t2 - t1);
    }

}
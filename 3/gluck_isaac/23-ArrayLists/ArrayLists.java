import java.util.*;
import java.io.*;

public class ArrayLists{
    public void test(int n){
	ArrayList<String> a = new ArrayList<String>();
	ArrayList<String> a2 = new ArrayList<String>();
	long start=System.currentTimeMillis();
	for (int i=0;i<n;i++)
	    a.add("yolo");
	long end=System.currentTimeMillis();
	System.out.println(end-start + ": for adding to the end of an ArrayList");

	long start2=System.currentTimeMillis();
	for (int i=0;i<n;i++)
	    a2.add(0, "yolo");
	long end2=System.currentTimeMillis();
	System.out.println(end2-start2 + ": for adding to the end of an ArrayList");
    }
    
    public static void main(String[] args){
	ArrayLists A = new ArrayLists();
	A.test(args[0]);
    }
}
import java.util.*;
import java.io.*;
public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> a = new ArrayList<Integer>();
	for (int i = 0; i < 100;i++)
	    a.add(i);
	System.out.println(a);
	ArrayList<Integer> rev = new ArrayList<Integer>();
	for (int i = 0; i < a.size();i++)
	    rev.add(a.size()-i-1);
	System.out.println(rev);
    }
}
/*
Adding and Removing from the front is significantly longer than Adding and Removing from the back of an arraylist
*/

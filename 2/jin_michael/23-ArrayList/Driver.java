import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> a=new ArrayList<Integer>();
	for (int i=0;i<10;i++)
	    a.add(i);
	ArrayList<Integer> b=new ArrayList<Integer>();
	for (int i=a.size()-1;i>=0;i--)
	    b.add(a.get(i));
	a=b;
	System.out.println(a);
    }
}

//Adding(2.961s) to the front takes exponentially longer than adding to the back(.005s).
//Removing from the front(3.842s) is a little bit slower than removing from the back(3.716s). 
//Used an ArrayList of 100,000 items.

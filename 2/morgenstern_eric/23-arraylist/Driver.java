import java.io.*;
import java.util.*;
//adding to end starts getting significantly slower after 100000 items
//adding to beginning starts getting significantly slower after 10000 items
//removing from end starts getting significantly slower after 1000000
//removing from beginning starts getting significantly slower after 10000
//adding and removing from the end is a lot quicker than from the beginning

public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> a = new ArrayList<Integer>();
	for(int i=0;i<10;i++){
	    a.add(i);
	}
	ArrayList<Integer> b = new ArrayList<Integer>();
	for(int i=0;i<a.size();i++){
	    b.add(9-i);
	}
	System.out.println(a);
	a = b;
	System.out.println(a);
    }
}

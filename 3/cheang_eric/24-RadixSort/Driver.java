import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){
	
	int length = 10;
	
	RadixSort Radix = new RadixSort();
	
	ArrayList RandomArray = Radix.RandomArrayList(length);
	
	ArrayList[] printMe = Radix.RadixSort(RandomArray);

	
	System.out.println(RandomArray);
	

	
	for (int foo = 0;		       
	     foo != length;
	     foo++){
	    
	    System.out.println(printMe[foo]);
	     
	
	
	}}}

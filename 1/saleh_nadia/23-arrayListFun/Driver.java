import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
	// found that it's faster to add to the end than to the beginning
	//and that it's faster to remove from the end than from the beginning

	ArrayList<Integer> A = new ArrayList <Integer>();
	for (int i = 1; i <6; i ++) {
	    A.add(i*5);
	}
	System.out.println(A);
	ArrayList<Integer> B = new ArrayList<Integer>();
	for (int i = A.size()-1; i>=0; i--) {
	    B.add(A.get(i));
	}
	A = B;
	System.out.println(A);
	
    }
}

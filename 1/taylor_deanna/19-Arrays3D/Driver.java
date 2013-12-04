import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Arrays_three A = new Arrays_three();
	int[] intArray = new int[10];
	int[] ArrayTwo = new int[9];
	for (int i=1; i<11; i++){
	    intArray[i-1] = i;
	}
	for (int j = 1; j<10; j++){
	    ArrayTwo[j-1] = j;
	}
	System.out.println(A.mean(intArray));
	System.out.println(A.stddev(ArrayTwo));
    }
}

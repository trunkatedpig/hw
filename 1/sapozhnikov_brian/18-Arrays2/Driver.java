import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	Arrays2 A = new Arrays2();
	int[] B = A.Revfill(6);
	int[] C = A.MakeRandom(5,3,9);
	for (int i=0;i<B.length;i+=1)
	    System.out.println(B[i]);
	System.out.println("------------------------");
	for (int i=0;i<C.length;i+=1)
	    System.out.println(C[i]);

	//tests for codingbat problems done online
    }
}

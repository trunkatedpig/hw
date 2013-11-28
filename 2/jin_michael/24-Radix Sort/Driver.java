import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
	Radix a = new Radix(1000000);
	
	System.out.println("\nMy Turn: ");
	long time1=System.currentTimeMillis();
       	a.sort();
	System.out.println(System.currentTimeMillis()-time1);
	
	System.out.println("Built in Turn: ");
	
	int[] b=new int[1000000];
	Random r = new Random();
	double r1;
        for (int i=0;i<100000;i++){
	    r1 = r.nextDouble();
	    b[i]=(int)(r1*1000);
	}
	
	time1=System.currentTimeMillis();
	Arrays.sort(b);
	System.out.println(System.currentTimeMillis()-time1);
    }
}

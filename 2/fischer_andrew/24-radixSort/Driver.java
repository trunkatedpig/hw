import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
	radixSort a = new radixSort(1000000); //new radix sort with 1mill numbers

	//run the sort and time it
	long start1=System.currentTimeMillis();
	a.radixSort();
	long time1 = System.currentTimeMillis() - start1;
        System.out.println(time1);


	//Built in sorting algorithm
	int[] b=new int[1000000]; //new 1mill spot int array

	//fill th array
        Random r = new Random();
        double r1;
        for (int i=0;i<100000;i++){
            r1 = r.nextDouble();
            b[i]=(int)(r1*1000);
        }

	long start2 = System.currentTimeMillis();
	Arrays.sort(b);
	long time2 =  System.currentTimeMillis() -start2;
	System.out.println(time2);

	if (time1>time2){
	    System.out.println("my sort is faster!");
	}
	else {
	    System.out.println("builtin sort is faster");
	}

    }   
}

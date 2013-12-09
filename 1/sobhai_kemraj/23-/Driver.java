import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Enter the size of the array");
			System.exit(0);
		}
		long start,t;

		int arraySize = Integer.parseInt(args[0]);
		start = System.currentTimeMillis();
		ArrayList A = new ArrayList();
		t = System.currentTimeMillis()-start;
		System.out.println("Array Size: "+arraySize+"\n Creation time: "+t);
		start=System.currentTimeMillis();
		for (int i =0; i<arraySize; i++)
			A.add(i);
			
		t = System.currentTimeMillis()-start;
		System.out.println("Add Time: "+t);
		
		/*
		add times: 
		1000: 2
		10000: 4
		100000: 15
		1000000: 53
		10000000:  3310
		100000000: At this point my i7 was over clocking at 2.87 GHz, and 100% utilization, way beyond normal conditions,
						  and I was unable to stop the program from cmd. (would have been worse on my linux machine which has a slower AMD).
		*/
		
	//	ArrayList B = new ArrayList();
	//	start=System.currentTimeMillis();
	//	for (int i = 0;i<arraySize;i++)
	//		B.add(0,i);
	//	t = System.currentTimeMillis()-start;
	//	System.out.println("Add Time To Front: "+t);
		
		
		/* 
		add times
		100: 0 
		1000: 4
		10000: 42
		100000: 887
		1000000: 120999
		At this point my i7 processor was over-clocking at 2.9 GHz (maximum speed of 2.4) and it still took this long!
		*/
		
	//	start=System.currentTimeMillis();
	//	for (int i =0; i<arraySize; i++)
	//		A.remove(0);
	//	t = System.currentTimeMillis()-start;
	//	System.out.println("Remove Time: "+t);
		
		/*
		Remove times:
		1000: 1
		10000: 41
		100000: 1337
		1000000: 132935 (i7 overclocking at 2.93 GHz and 100% utilization)
		*/
		
		start=System.currentTimeMillis();
		for (int i =arraySize - 1; i>-1; i--)
			A.remove(i);
			
		t = System.currentTimeMillis()-start;
		System.out.println("Remove Time From the End: "+t);
		
		/*
		Remove Times:
		10000: 2
		100000: 8
		1000000:9
		10000000: 56
		100000000:  I was unable to create it in a reasonable time, so gave up!
		*/
		
		ReverseList(ArrayList L){
			ArrayList temp = new ArrayList();
			int count = L.size();
			for (int i = 0; i<L.size();i++){
				// Someone finish this!!!!
			}
		}
		
	}		
}
			
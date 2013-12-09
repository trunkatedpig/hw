import java.util.*;

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
	/*t = System.currentTimeMillis()-start;
	System.out.println("Array Size: "+arraySize+" Creation time: "+t);
	start=System.currentTimeMillis();
	for (int i =0; i<arraySize; i++)
	A.add(i);*/
		
	t = System.currentTimeMillis()-start;
	//System.out.println("Add Time: "+t);
	/*add times: 
	1000: 0
	10000: 4
	100000: 16
	1000000: 35
	10000000: 6494*/
	
	/*
	start=System.currentTimeMillis();
	for (int i = 0;i<arraySize;i++)
		A.add(0,i);
	t = System.currentTimeMillis()-start;
	System.out.println("Add Time2: "+t);
    }
	
	/* add times
	100: 0 
	1000: 1
	10000: 96
	100000: 1068
	*/
	  
	/*start=System.currentTimeMillis();
	for (int i = 0;i<arraySize;i++) {
		A.add(0, i);
		
		A.remove(0);
		}
	t = System.currentTimeMillis()-start;
	System.out.println("Remove time: "+t);
	*/
	//jumped from 167ms to 1324 ms at 100,000,000 
	//then to ~13000ms at 1,000,000,000
	
	/*	
		start=System.currentTimeMillis();
	for (int i = 0;i<arraySize;i++) {
		A.add(0, i);
		
		A.remove(0, i);
		}
	t = System.currentTimeMillis()-start;
	System.out.println("Remove time: "+t);
	*/
	//about the same speed
	
	ArrayList<Integer> A = new ArrayList <Integer>();
        for (int i = 1; i <6; i ++) {
            A.add(i+3);
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
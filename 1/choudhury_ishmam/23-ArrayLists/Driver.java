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
	System.out.println("Add Time: "+t);*/
	/*add times: 
	1000: 0
	10000: 4
	100000: 16
	1000000: 35
	10000000: 6494*/
	
	
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
	*
	    
}
	    
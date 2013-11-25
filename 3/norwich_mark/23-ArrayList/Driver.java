import java.io.*; 
import java.util.*; 

public class Driver{ 
    public static void main(String[] args){ 
	ArrayList<Integer> a = new ArrayList<Integer>(); 
	long start, stop; 
	start = System.currentTimeMillis();
	Random r = new Random();
	for (int i = 0; i < 1000; i++)
	    a.add(r.nextInt(100));
	stop = System.currentTimeMillis();
	System.out.println("It took" + (stop - start) + "milliseconds to add to the end");
	ArrayList<Integer> a2 = new ArrayList<Integer>(); 
	///	Random r = new Random();
        start = System.currentTimeMillis(); 
        for (int i = 0; i < 1000; i++)
	    a2.add(0,r.nextInt(100)); 
	stop = System.currentTimeMillis();
        System.out.println("It took" + (stop - start) +" milliseconds to add to the front"); 

	 
	           ArrayList<Integer> a3 = new ArrayList<Integer>();
		   /// Random r = new Random(); 
		   for (int i = 0; i < 10; i++)
		       a3.add(r.nextInt()); 
		   ArrayList<Integer> temp = new ArrayList<Integer>(); 
		   for (int i = a3.size(); i > 0; i--){
		       temp.add(a3.get(i-1));
		   } 
		   a3 = temp; 
		   System.out.println("Reverse: " + a3); 
    }
}
		   
	
			   
		   
		   
	 
		

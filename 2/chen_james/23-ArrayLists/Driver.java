import java.io.*;
import java.util.*;
public class Driver {
    //add at end: 20,000,000 602 ms. After that, ran out of heapspace
	//add at beginning:200,000 items 8,470 ms 
	//remove at end: 20,000,000 objects 141 ms. 200,000,000 -> ran out of heap space
	//remove at beginning: 200,000 objects was 3,037 ms. 2,000,000 objects 420,217 ms approx 7 min.
	
    public static void main(String[] args) {
	//makes empty array list
	ArrayList<Integer> a = new ArrayList<Integer>();
	
	
		
	long start,t;
	System.out.println("Initial ArrayList");
	System.out.println(a.toString());

/*
 	System.out.println("<----------------------------------------------->");
	System.out.println("Add at end");
	start = System.currentTimeMillis();
	
	for (int i = 0; i<20000000;i++) {
	    a.add(100);
	}
	//ADD: i run out of heap space after 20,000,000 (602 ms)

	t = System.currentTimeMillis()-start;
	
	System.out.println("Constructor time: "+t);
*/
	
	
	/*
	
	System.out.println("<----------------------------------------------->");
	System.out.println("Add at beginning");
	start = System.currentTimeMillis();
	
	for (int i = 0; i<200000;i++) {
	    a.add(0,100);
	}
	//wow takes 8,470 ms at 200,000 items already. Much slow + more memory than add()

	t = System.currentTimeMillis()-start;
	
	System.out.println("Constructor time: "+t);
*/
	
	
/*	
	System.out.println("<----------------------------------------------->");
	System.out.println("Remove at beginning");
	for (int i = 0; i<2000000;i++) {
	    a.add(100);
	}
	start = System.currentTimeMillis();
	
	for (int i = 0; i<a.size();i++) {
	    a.remove(i);
	}
	//remove time for 200,000 objects was 3,037 ms. 
	//For 2,000,000 objects, it's taking a long time -> 420,217 ms approx 7 min.

	t = System.currentTimeMillis()-start;
	
	System.out.println("Constructor time: "+t);
*/

/*
System.out.println("<----------------------------------------------->");
	System.out.println("Remove at end");
	for (int i = 0; i<20000000;i++) {
	    a.add(100);
	}
	start = System.currentTimeMillis();
	
	for (int i = a.size()-1; i>0;i--) {
	    a.remove(i);
	}
	//remove time for 200,000,000 objects ran out of heap space
	//For 20,000,000objects, a lot faster than beginning -> 141 ms

	t = System.currentTimeMillis()-start;
	
	System.out.println("Constructor time: "+t);
	*/
	
	
	
	System.out.println("<----------------------------------------------->");
	System.out.println("Reverse ArrayList");
	System.out.println(a.toString());
	for (int i = 0; i<30;i++) {
	    a.add(i);
	}
	ArrayList<Integer> temp = new ArrayList<Integer>(a.size());

	System.out.println(a.size());
	
	int j = a.size()-1;
	for (int i = 0; i < a.size(); i++) {
	temp.add(a.get(j));
	j=j-1;
	
	}
	System.out.println(temp.toString());

	
	

	
	
    }

}
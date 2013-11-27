import java.util.*;

public class ArrayLists{
    public static void main(String[] args) {
       	ArrayList<Integer> al1 = new ArrayList<Integer>();
	ArrayList<Integer> al2 = new ArrayList<Integer>();
    
	long start = System.currentTimeMillis();
	for (int i=0; i<1000000; i++){
	    al1.add(0);
	}

	long stop = System.currentTimeMillis();
	//System.out.println(stop-start);
	
	long start2 = System.currentTimeMillis();
	for (int i=0; i<1000000; i++){
	    // al2.add(i, 0);
	    al2.add(0);
	}
	long stop2=System.currentTimeMillis();
	//System.out.println(stop2-start2);
	
	// At 1 million add(n) is faster by about 200 milliseconds
	//At 10 million add(pos, n) is faster by about 600 milliseconds
	long start3=System.currentTimeMillis(); 
	for (int i=0; i<al1.size(); i++){
	    al1.remove(i);
	}
	long stop3=System.currentTimeMillis();
	System.out.println(stop3-start3);
	long start4=System.currentTimeMillis();
	for (int i=0; i<al2.size(); i++){
	    al1.remove();
	}
	long stop4=System.currentTimeMillis();
	System.out.println(stop4-start4);
	
	
	
	
	
	
    }
    

    
}

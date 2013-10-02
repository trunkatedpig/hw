import java.util.*;
import java.io.*;

    public class Coin {
	public static void main(String[] args) {

	    Random r = new Random();
	    int r1 = r.nextInt(2);
	    int heads; //do I need "= 0"?
	    
	
	       if (r1 == 1) {
		System.out.println("heads");
		//heads = heads + 1;
	    } 
	     else {
	    	System.out.println("tails"); }

	       System.out.println(heads);
	}
    }
    


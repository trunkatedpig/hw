import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	Bucket Justin = new Bucket();
	Bucket Maria = new Bucket(); 
	//System.out.println(Justin);
	Long one = System.currentTimeMillis();
	Justin.sort();
	Long two = System.currentTimeMillis();
	//System.out.println(Justin);
	System.out.println(two - one);

	//System.out.println(Maria);
	one = System.currentTimeMillis();
	Arrays.sort(Maria.get());
	two = System.currentTimeMillis();
	//System.out.println(Maria);
	System.out.println(two - one);

	/*The longer the inital array is the longer it takes to sort the array 
	  using either method. The longer the length of the elements of the 
	  inital array, the longer it takes to sort them using either method. 
	  The method we wrote though is the slowest of the two no matter what.
	*/

	

	

	
    }
}
	

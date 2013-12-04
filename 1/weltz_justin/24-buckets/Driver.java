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
	System.out.println("Radix: " + (two - one));

	//System.out.println(Maria);
	one = System.currentTimeMillis();
	Arrays.sort(Maria.get());
	two = System.currentTimeMillis();
	//System.out.println(Maria);
	System.out.println("arrays: " + (two - one));
	

	

	
    }
}
	

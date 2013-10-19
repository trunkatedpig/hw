import java.io.*;
import java.util.*;


public class Driver{
    
    public static void main(String[] args){
	Rational rat = new Rational();

	Random r = new Random();

	int roll = r.nextInt(6) + 1;
	
	System.out.println((r.nextInt(100)));
	System.out.println(Math.abs((r.nextInt(100))));
	for (int x = 10; x >= 0; x--)
	    System.out.println(r.nextInt(6) + 1);

	

	
    }
    
}

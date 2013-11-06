
import java.io.*;
import java.util.*;


public class Driver{
    public static void main(String[] args) {
	Arrays2 x = new Arrays2();
	Arrays2 y = new Arrays2();
	Arrays2 z = new Arrays2();
	Arrays2 a = new Arrays2();
	int [] testArraysum13 = new int[] {13,1,2,13,2,1,13};
	int [] testArraymodthree = new int[] {1,2,1,2,1};
	
	
	
	System.out.println(Arrays.toString(x.Revfill(5)));
	System.out.println(Arrays.toString(y.MakeRandom(5,5,10)));
	System.out.println(z.sum13(testArraysum13));
	System.out.println(a.modThree(testArraymodthree));
	 
	}
}	 
	 
	 
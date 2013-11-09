import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String[] args) {
	Arrays2 a = new Arrays2();
	System.out.println("RevFill examples:");
	System.out.println(Arrays.toString(a.RevFill(5)));
	System.out.println(Arrays.toString(a.RevFill(15)));
	System.out.println(Arrays.toString(a.RevFill(0)));

	System.out.println("\nmakeRandom examples:");

	System.out.println(Arrays.toString(a.makeRandom(5,20,30)));
	System.out.println(Arrays.toString(a.makeRandom(10,15,30)));

	System.out.println("\nsum13 examples:");

	int[] test1 = new int[] {1,2,2,1};
	int[] test2 = new int[] {1,1};
	int[] test3 = new int[] {1,2,2,1,13};
	int[] test4 = new int[] {13,1,2,13,2,1,13};
	System.out.println(a.sum13(test1));
	System.out.println(a.sum13(test2));
	System.out.println(a.sum13(test3));
	System.out.println(a.sum13(test4));

	System.out.println("\nmodThree:");

	int[] test5 = new int[] {2,1,3,5};
	int[] test6 = new int[] {2,1,2,5};
	int[] test7 = new int[] {9,7,2,9,2,2};
	int[] test8 = new int[] {9,7,2,9,2,2,6};

	System.out.println(a.modThree(test5));
	System.out.println(a.modThree(test6));
	System.out.println(a.modThree(test7));
	System.out.println(a.modThree(test8));

    }

}

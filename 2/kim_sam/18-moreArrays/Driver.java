import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Arrays2 ar = new Arrays2();
	int[] testsum13 = new int[] {1, 2, 4, 13, 18, 1};
	int[] testmodthree1 = new int[] {1, 1, 1, 2};
	int[] testmodthree2 = new int[] {2, 2, 2, 3};
	int[] testmodthree3 = new int[] {1, 2, 1, 2};

	System.out.println(Arrays.toString(ar.Revfill(8)));
	System.out.println(Arrays.toString(ar.makerandom(8, 2, 10)));
	System.out.println(ar.sum13(testsum13));
	System.out.println(ar.modthree(testmodthree1));
	System.out.println(ar.modthree(testmodthree2));
	System.out.println(ar.modthree(testmodthree3));
    }
}

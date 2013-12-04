import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
		Array a = new Array();
		int[] test = new int[] {1,2,3,1};
		System.out.println(Arrays.toString(a.Revfill(5)));
		System.out.println(Arrays.toString(a.MakeRandom(5, 3, 6)));
		System.out.println(a.sum13(test));
		System.out.println(a.modThree(test));
    }
}
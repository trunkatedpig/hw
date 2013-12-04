import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("*-* Testing class Arrays *-*");
		System.out.println();

		Arrays a;
		a = new Arrays();

		System.out.println("RevFill Method");
		System.out.println("Array if input is 5: ");
		int[] z = a.RevFill(5);
		for (int i=0; i<z.length; i++) {
			System.out.println(z[i]);
		}
		System.out.println();

		System.out.println("MakeRandom Method");
		System.out.println("Array if input is size=5, min=2, max=8: ");
		int[] y = a.MakeRandom(5,2,8);
		for (int i=0; i<y.length; i++) {
			System.out.println(y[i]);
		}
		System.out.println();

		System.out.println("MakeRandom Method");
		System.out.println("Array if input is size=5, min=2, max=8: ");
		int[] x = a.MakeRandom(5,2,8);
		for (int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
		System.out.println();
	}
}
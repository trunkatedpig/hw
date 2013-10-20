import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("*-* Testing class For *-*");
		System.out.println();

		For f;
		f = new For();

		System.out.println("For-loop Factorial");
		System.out.println("Factorial of 10: " + f.factorial(10));
		System.out.println("Factorial of 5: " + f.factorial(5));
		System.out.println("Factorial of 1: " + f.factorial(1));
		System.out.println();

		System.out.println("Reverse Word");
		System.out.println("Reverse of hello: " + f.reverse("hello"));
		System.out.println("Reverse of apple: " + f.reverse("apple"));
		System.out.println("Reverse of anna: " + f.reverse("anna"));
		System.out.println();

		System.out.println("Table of Products");
		System.out.println("Product Table 5 x 3");
		System.out.println(f.table(5,3));

	}
}

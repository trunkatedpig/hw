import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("*-* Testing class Loops *-*");
		System.out.println();

		Loops l;
		l = new Loops();

		System.out.println("Using recursive factorial method");
		System.out.println("Factorial of 10: " + l.fact(10));
		System.out.println("Factorial of 5: " + l.fact(5));
		System.out.println("Factorial of 1: " + l.fact(1));
		System.out.println();

		System.out.println("Using loop factorial method");
		System.out.println("Factorial of 12: " + l.fact2(12));
		System.out.println("Factorial of 4: " + l.fact2(4));
		System.out.println("Factorial of 1: " + l.fact2(1));

	}
}
import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("*-* Testing class Rational *-*");
		System.out.println();

		Rational r1,r2,r3,r4;

		r1 = new Rational (3,4);
		System.out.println("TEST 1");
		System.out.println("Rational Number: " + r1.getFraction());
		System.out.println("Numerator: " + r1.getNumerator());
		System.out.println("Denominator: " + r1.getDenominator());
		r1.reduce();
		System.out.println("Reduced Fraction: " + r1.getFraction());
		System.out.println();

		r1 = new Rational (0,4);
		System.out.println("TEST 2");
		System.out.println("Input Rational Number: 0/4");
		System.out.println("Rational Number: " + r1.getFraction());
		r1.reduce();
		System.out.println("Reduced Fraction: " + r1.getFraction());
		System.out.println();

		r1 = new Rational (5,0);
		System.out.println("TEST 3");
		System.out.println("Input Rational Number: 5/0");
		System.out.println("Rational Number: " + r1.getFraction());
		r1.reduce();
		System.out.println("Reduced Fraction: " + r1.getFraction());
		System.out.println();

		r1 = new Rational (3,6);
		System.out.println("TEST 4");
		System.out.println("Rational Number: " + r1.getFraction());
		r1.reduce();
		System.out.println("Reduced Fraction: " + r1.getFraction());
		System.out.println();

		r2 = new Rational(1,4);
		System.out.println("TEST 5");
		System.out.println("This Rational: " + r2.getFraction());
		System.out.println("Other Rational: " + r1.getFraction());
		System.out.println("Are these Rational numbers equal? " + r2.equals(r1));
		System.out.println();

		r3 = new Rational(2,8);
		System.out.println("TEST 6");
		System.out.println("This Rational: " + r2.getFraction());
		System.out.println("Other Rational: " + r3.getFraction());
		System.out.println("Are these Rational numbers equal? " + r2.equals(r3));
		System.out.println();

		System.out.println("TEST 7");
		System.out.println("This Rational: " + r1.getFraction());
		System.out.println("Other Rational: " + r2.getFraction());
		r4 = r1.mult(r2);
		System.out.println("The Two Rational Numbers Multiplied: " + r4.getFraction());
		System.out.println();

		r1 = new Rational (0,4);
		System.out.println("TEST 8");
		System.out.println("This Rational: " + r1.getFraction());
		System.out.println("Other Rational: " + r2.getFraction());
		r4 = r1.mult(r2);
		System.out.println("The Two Rational Numbers Multiplied: " + r4.getFraction());
		System.out.println();

		r1 = new Rational (5,0);
		System.out.println("TEST 9");
		System.out.println("This Rational: " + r1.getFraction());
		System.out.println("Other Rational: " + r2.getFraction());
		r4 = r1.mult(r2);
		System.out.println("The Two Rational Numbers Multiplied: " + r4.getFraction());
		System.out.println();

		r1 = new Rational(1,2);
		r2 = new Rational(1,4);
		r3 = new Rational(0,8);
		r4 = new Rational(2,8);
		System.out.println("TEST 10");
		System.out.println("Compare " + r1.getFraction() + " to " + r2.getFraction() + ": " + r1.compareTo(r2));
		System.out.println("Compare " + r2.getFraction() + " to " + r1.getFraction() + ": " + r2.compareTo(r1));
		System.out.println("Compare " + r2.getFraction() + " to " + r3.getFraction() + ": " + r2.compareTo(r3));
		System.out.println("Compare " + r3.getFraction() + " to " + r2.getFraction() + ": " + r3.compareTo(r2));
		System.out.println("Compare " + r2.getFraction() + " to " + r4.getFraction() + ": " + r2.compareTo(r4));
		System.out.println();





	}
}

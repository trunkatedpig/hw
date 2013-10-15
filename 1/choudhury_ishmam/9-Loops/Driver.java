import java.io.*;
import java.util.*;

public class Driver{
	public static void main(String[] args){
		Loops loop = new Loops();
		int output = loop.fact(3);
		System.out.println(loop.fact2(3));
		System.out.println(loop.fact2(0));
		System.out.println(loop.fact2(1));
		System.out.println(loop.fact(3));
		System.out.println(loop.fact(0));
		System.out.println(loop.fact(1));
		System.out.println(loop.GCD(6,3));
		System.out.println(loop.GCD(6,2));
		System.out.println(loop.GCD(1,1));
		System.out.println(loop.GCD(0,0));
		System.out.println(loop.GCD(100,10));
		System.out.println(loop.GCD(7,5));

		System.out.println(loop.GCD2(100,100));
		System.out.println(loop.GCD2(6,3));
		System.out.println(loop.GCD2(6,2));
		System.out.println(loop.GCD2(1,1));
		System.out.println(loop.GCD2(0,0));
		System.out.println(loop.GCD2(100,10));
		System.out.println(loop.GCD2(7,5));

		System.out.println(loop.GCD2(100,100));
		
		System.out.println(loop.isPrime(1));
		System.out.println(loop.isPrime(2));
		System.out.println(loop.isPrime(3));
		System.out.println(loop.isPrime(4));
		System.out.println(loop.isPrime(5));
		System.out.println(loop.isPrime(6));
		System.out.println(loop.isPrime(7));
		System.out.println(loop.isPrime(8));
		System.out.println(loop.isPrime(9));
		System.out.println(loop.isPrime(10));
		System.out.println(loop.isPrime(14));
		System.out.println(loop.isPrime(17));
		System.out.println(loop.isPrime(19));
	
	}



}

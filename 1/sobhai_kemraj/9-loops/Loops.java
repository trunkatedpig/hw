import java.io.*;
import java.util.*;

public class Loops{
	public int fact(int n){
		if (n <= 1)
			return 1;
		else
			return n*fact(n-1);
	}

	public int fact2(int n){
		int number;
		if (n <= 1)
			return 1;
		number = 1;
		while (n>0){
			number = number * n;
			n = n-1;
		}
		return number;
	}
	
	public int GCD (int a, int b){
		int divisor, dividend,other;
		if (a<b){
			divisor=a;
			dividend=b;
			other=a;}
		else {
			dividend=a;
			divisor=b;
			other=b;}
		while (divisor > 0){
			if (dividend % divisor == 0) {
				if (other %  divisor == 0) {
					return divisor;
				}
			}
			divisor = divisor - 1;
		}
		return 1;
		
	}

	public double MurderousMethod(int n){
		if (n==1||n==2||n==3)
			return 0.5;
		return (((n*n)+17)/12.0);
	}

	public String isPrime(int n){
		if (MurderousMethod(n)%1==0.5)
			return n + " is a Prime number";
		return n + " is a Composite number";
	}

	public int GCD2(int a, int b) {
		int r;
		while (b != 0) { 
			r = a%b;
		  	a = b;
			b = r;
		}
		return a;
	}































}

import java.io.*;
import java.util.*;

public class Rationals{

	private int a, b;

	public int gcd(int a, int b) {

	 	if (b==0)
			return a;
		else 
	   		return gcd(b,a%b);

	} 

	public void reduce() {

		a = a / gcd(a,b);
		b = b / gcd(a,b);

	}

	public Rationals(int num, int denom){

		a = num;
		b = denom;
		//reduce();

	}

	public boolean equals (Rationals other){

		if (((double)a/b)==((double)other.a/other.b))
			return true;
		return false;

	}

	public Rationals mult (Rationals other){

		int a1 = a * other.a;
		int b1 = b * other.b;
		Rationals result = new Rationals(a1,b1);
		return result;

	}

	public int compareTo (Rationals other){

		double R1 = (double)a/b;
		double R2 = (double)other.a/ other.b;

		if (R1 < R2)
			return -1;
		if (R1 > R2)
			return 1;
		return 0;

	}
}

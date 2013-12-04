import.java.io.*;
import.java.util.*;

public class recursion{
	public int factorial(int n){
		if (n==0){
			return 1;
		}
		else {
			return (n * (factorial(n-1)));
		}
	}
	public int gcd(int a,b){
		int store;
		if (a < b){
			store=b;
			b=a;
			a=store;
		}
		if (a % b == 0){
			reutrn b;
		}
		else {
			return gcd(a, b - 1)
		}
	}
	public int gcd2(int a,b){
		int store;
		if (a < b){
			store=b;
			b=a;
			a=store;
		}
		while (b != 0){
			store=b;
			b=a%b;
			a=store;
		}
		return a;
	}
	public int prime(n){
		int check;
		while (n%check !=0){
			if (check==2){
				return false;
			}
			check=check-1;
		}
		return true;
	}
}

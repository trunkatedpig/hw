import java.io.*;
import java.util.*;

public class Loops {

	private int ans = 1;
	
	public int fact (int n) {
		if (n == 0) {
			return 1;
		}
		return n * fact (n-1);
	}
		
	public int fact2 (int n) {
		
		while (n != 0) {
			ans = ans * n;
			n--;
		}
		return ans;
	}
	
	public int gcd (int a, int b) {
		int greater;
		int less;
		if (a > b) {
			greater = a;
			less = b;
		}
		else {
			greater = b;
			less = a;
		}
		if (less == 0) {
		return greater; 
		}
		return gcd (less, greater%less);
		}

	public int gcd2 (int a, int b) {
		int greater;
		int less;
		if (a > b) {
			greater = a;
			less = b;
		}
		else {
			greater = b;
			less = a;
		}
		while (less != 0) {
			int r = greater % less;
			greater = less;
			less = r;
		}
		return greater;
	}
	
    /*	public boolean isPrime (int n) {
		
		 if (n <= 1)
		 return false;
		 if (n ==2) 
		 return true;
		
		 int num = n;
		 while (n > 1) {
		 if (gcd2(num,n)!=0)
		 {n = n - 1;}
		 else {
		 return false;
		 }
    */	 
		
			
		 
			
		
		
       	
}


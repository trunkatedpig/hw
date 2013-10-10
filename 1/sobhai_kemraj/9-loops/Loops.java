import java.io.*;
import java.util.*;

public class Loops{
	public int fact(int n){
		if (n <= 1)
			return 1;
		else
			return n*fact(n-1);
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
}

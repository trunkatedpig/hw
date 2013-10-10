import java.io.*;
import java.util.*;

public class Driver{
	public static void main(String[] args){
		Loops loop = new Loops();
		int output = loop.fact(3);
		System.out.println(loop.fact(3));
		System.out.println(loop.fact(0));
		System.out.println(loop.fact(1));
	}
//Move shit to correct file i.e. loops
	public int GCD (int a, int b){
		private int divisor, dividend,other;
		if (a<b)
			divisor=a;
			dividend=b;
			other=a;
		else 
			dividend=a;
			divisor=b;
			other=b;
		while (divisor > 0){
			if (dividend % divisor == 0) {
				if (other %  divisor == 0) {
					return divisor;
					}
			else 
		}
	}


}

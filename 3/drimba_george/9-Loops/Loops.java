import java.io.*;
import java.util.*;
//Loops
public class Loops {
    public int fact(int n) {
	int answer;
	if (n == 1 || n == 0 ) 
	    answer = 1;
	else
	    result = n * fact(n-1);
	return answer;
    }
    //recursion(while)
    public int fact2(int n) {
	int answer, count, fact;
	count = n;
	fact = 1;
	while (count != 1) {
	    fact = fact*count;
	    count = count - 1;
	}
	return fact;
    }

    public static void main(String[ ] args) {
	Loop g = new Loop();
	System.out.println(g.fact(31));
	System.out.println(g.fact2(9));
	System.out.println(g.fact2(1));
    }

public int gcd (int a, int b) {
	int c = Math.min (a, b);
	if (a % c == 0 && b % c == 0) 
		return c;
	else
		return gcd (a, c-1);
	}
    }

    public int gcd2(int a, int b) {
	if (b > a) {
	    return gcd2(b,a);}
	else {
	    if (b == 0) {
		return a;}
	    else {
		return gcd2(b,a%b);}
	}
    }
    
    public boolean isPrime(int a) {
	int b = a-1;
	while (a%b != 0) {b = b-1;}
	return (b == 1);
    }
}

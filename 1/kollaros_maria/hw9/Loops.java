import java.io.*;
import java.util.*;

public class Loops{
    public int fact(int n){
	if (n == 0 || n == 1)
	    return 1;
        else 
	    return (n * fact(n-1));
    }

    public int fact2(int n){
	int answer = 1;
	while (n > 1){
	    answer = answer * n;
	    n = n - 1;
	}
	return answer;
    }

    public int GCD(int a, int b) {
	int g = 0;
	if (a < b)
	    g = a;
	else
	    g = b;
	while ((b % g) != 0 || (a % g) != 0)
		g = g - 1;
	return g;
    }

    //worked with Justin Weltz on this part
    public int GCD3(int a, int b){
	int g = 0;
	if (a < b)
	    g = a;
	else 
	    g = b;
	for (g = g;(b % g) != 0 || (a % g) != 0; g =g -1){
	}
	return g;
    }
		
    //worked with Sapphea for this part
     public int GCD2(int a, int b) {
	if (b == 0) {
	    return a;
	}
	else
	    return GCD2(b, (a % b));
     }

    //got help from Andrew and Spencer for this part
    public int GCD2L(int a, int b){
	while (a != 0 && b!= 0)
	    if (a < b)
		b = b % a;
	    else 
		a = a % b;
	return Math.max(a,b);
    }

    //worked with Sapphea on this part- mostly Sapphea
    public boolean isPrime(int n){
	if (n == 1)
	    return false;
	else{
	    double a = 2;
	    boolean b = true;
	    while (a < Math.sqrt(n)) {
		if ((n % a) == 0) {
		    b = false;
		    a = Math.sqrt(n);
		}
		else 
		    a = a + 1;
	    }
	    return b;
	}
    }

}

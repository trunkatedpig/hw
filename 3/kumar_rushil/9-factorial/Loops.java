import java.io.*;
import java.util.*;
public class Loops{

    public int fact(int n){
    if (n == 1){
	return n;
    } else {
	return (n * fact((n-1)));
    }
    }
    public int fact2(int n){
	int result = n;
	while (n > 1){
	    result = result * (n - 1);
	    n--;
	}
	return result;
    }

    public int gcd (int a, int b){
	int l,g;
	int result = 0; 	
	if (a > b){
	    l = b;
	    g = a;
	}else { 
	    l = a;
	    g = b;
	}
	if ((g%l = 0))
	    return l;
	while (g%l != 0){
	    result = l - 1;
	    l = l -1; 
	}
	return result;
    }
}

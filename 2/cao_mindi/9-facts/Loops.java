import java.io.*;
import java.util.*;

public class Loops{
    private int a;
    private int n;
    public Loops(){
    }
    
public int fact(int n){
    if (n > 0){
	return n*(fact(n-1));
}
    if (n < 0) {
	return 0 ;
}
    else{
	return 1;
    }
}

    public int fact2(int n){
	a = n;
	while (n > 2){
	    n = n-1;
	    a = a*n;
	}
	return a;
}

    public int gcd(int x, int y){
	int b = y;
	while (x%b != 0 || y%b != 0){
		b = b - 1;
	    }
	    return b;
	}
	    

    public int gcd2(int x, int y){
	int ans = 0;
	if (x > y){
	    while (x%y != 0){
		ans = gcd(x, x-y);
	    }
	    return ans;
	}
	else{
	    while (y%x != 0){
		ans = gcd(y, y-x);
	    }
	    return ans;
	}
    }

    public Boolean isPrime(int n){
	int a = n - 1;
	while (n%a != 0){
	    a = a-1;
		}
	return a == 1;
    }
}

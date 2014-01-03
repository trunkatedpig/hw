import java.io.*;
import java.util.*;

public class GCD {
    public int gcd ( int a , int b ) {
	if ( a < b ){
	    int r;
	    r=b;
	    b=a;
	    a=r;
	}
	int ans = b;
	while ( a%ans != 0 || b%ans != 0 ) {
	    ans = ans - 1;
	}
	return ans;
    }

    public int gcd2 ( int a , int b ) {
	if ( a < b ){
	    int r;
	    r=b;
	    b=a;
	    a=r;
	}
	while ( a%b != 0 ) {
	    int x = a;
	    a = b;
	    b = x%b;
	}
	return b;
    }

    public boolean isPrime ( int n ) {
	int ans = n - 1;
	while ( n%ans != 0 )
	    ans = ans - 1;
	if ( ans == 1 )
	    return true;
	else return false;
    }
}


































    /*
    private int ans;
    public int gcd ( int a, int b ) {
	if ( a%ans == 0 && b%ans == 0 )
	    return ans;
	else {
	    ans = ans - 1;
	    return gcd ( a , b );
	}
    }

    public int gcd2 ( int a , int b ) {
	if ( a < b ){
	    int r;
	    r=b;
	    b=a;
	    a=r;
	}
	while ( a%b != 0 ) {
	    a = b;
	    b = a%b;
	}
	return b;
	}*/

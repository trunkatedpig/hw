import java.io.*;
import java.util.*;

public class GCD {
    public int gcd ( int a, int b ) {
	if ( a < b ){
	    int r;
	    r=b;
	    b=a;
	    a=r;
	    return (a);
	    
	}
	if (b%a == 0) {
	    return a;
	}
	else {
	    return gcd(a-1,b);
	}
    }
    public int gcd2(int a, int b) {
	int result;
	int r;
	if (b != 0){
	    r=b;
	    b=a%b;
	    while (result != 0) {
		
 }
}
}
}
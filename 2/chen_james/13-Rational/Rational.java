import java.io.*;
import java.util.*;

public class Rational {

private int a;
private int b;
private double result;

public Rational(int x, int z) {
	a = x;
	b = z;
	result = a / b;
	
	
}

public int gcd(int a,int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);
	} 
}
    
public void reduce() {
	int n = gcd(a,b);
	a = a / n;
	b = b / n;
}

public boolean equals(Rational other) {
	other.reduce();
	t

}




}
/*Write the following methods

public boolean equals(Rational other) 
– returns True if the Rational number represented by other is 
the same as the one represented by this.

public Rational mult(Rational other)
– create and return a new Rational that is the result of multiplying other and this. 
For example if the two rational numbers were 4/3 and 1/2 
the mult routine would create a new Rational number representing 4/6 (or 2/3 when reduced).

public int compareTo(Rational other)
– returns 0 if this and other represent equal rational numbers, 
a positive value if this represents a rational number greater than 
the one represented by other and a negative number is returned otherwise.
*/

import java.io.*;
import java.util.*;

private int a;
private int b;

public class Rational{
    
    public int gcd(a,b) {
	if (b=0)
	    return a;
	else {
	    return gcd(b,a%b);
	}
    }
    
    public void reduce() {
	a = a / gcd(a,b);
	b - b / gcd(a,b);
    }
    
    
    public boolean equals(Rational other){
	// returns True if the Rational number represented by other is the same as the one represented by this.
	return a == other;
    }

    public Rational mult(Rational other){
	//creates and returns a new Rational that is the result of multiplying other and this. 

    }

    public in compareTo(Rational other){
	/* returns 0 if this and other represent equal rational numbers, 
	   a positive value if this represents a rational number greater than 
	   the one represented by other and a negative number is returned otherwise.*/
	
	
    }
}

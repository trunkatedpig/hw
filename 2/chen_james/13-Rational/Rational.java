import java.io.*;
import java.util.*;

public class Rational {

private int a;
private int b;
//private double result;

public Rational(int a, int b) {
        this.a = a;
        this.b = b;
        reduce();
}

public int gcd(int a,int b) {
        if (b==0)
            return a;
        else {
            return gcd(b,a%b);
        } 
}
    

public void reduce() {
        a = a / gcd(a,b);
        b = b / gcd(a,b);
}
//returns True if the Rational number represented by other is the same as the one 
//represented by this.

public boolean equals(Rational other) {
        
         return (other.a == this.a && other.b == this.b);
}
/*create and return a new Rational that is the result of multiplying other and this. 
For example if the two rational numbers were 4/3 and 1/2 the 
mult routine would create a new Rational number representing 4/6 (or 2/3 when reduced). */

 public Rational mult(Rational other){
        int c = this.a * other.a;
        int d = this.b * other.b;
        Rational newresult = new Rational(c,d);
        return newresult;
}

 /*returns 0 if this and other represent equal rational numbers, 
 a positive value if this represents a rational
 number greater than the one represented by other and 
 a negative number is returned otherwise. */
 //public int compareTo(Rational other){
     //   double one,two;
                
}

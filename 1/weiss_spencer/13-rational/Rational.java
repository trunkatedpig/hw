import java.io.*;
import java.util.*;

public class Rational{
    private int den;
    private int num;

    public Rational(int x, int y){
        den = x;
        num = y;
        reduce(x,y);
    }

    public int gcd(int a,int b) {
        if (b==0)
            return a;
        else {
            return gcd(b,a%b);
        }
    }

    public void reduce(int a, int b) {
       a = a / gcd(a,b);
       b = b / gcd(a,b);
   }

    public boolean equals(Rational other) {
        if (den/num == other.den/other.num) {
            return true;
        } 
	else {
            return false;
        }
    }

    public Rational mult(Rational other) {
        int x, y;
        x = den * other.den;
        y = num * other.num;
        Rational result = new Rational(x,y);
        return result;
    }
    
    public int compareTo(Rational other) {
        double quo1, quo2;
        quo1 =  num / den;
        quo2 = other.num / other.den;
        if (quo1 == quo2) 
            return 0;
        else if(quo1 > quo2) 
            return 1;
        else 
            return -1;
    }

}

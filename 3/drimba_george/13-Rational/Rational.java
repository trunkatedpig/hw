import java.io.*;
import java.util.*;

public class Rational {
    private int a,b;
   
    public int geta() {return a;}
    public int getb() {return b;}
    public String getab() {return "a = " + a + ", b = " + b;}


    public Rational(int p, int q) {
        a = p;
        b = q;
    }



    public int gcd(int a, int b) {
        if (b==0) {
            return a;}
        else {
            return gcd(b,a%b);} 
    }
    
    public void reduce() {
        int m = gcd(a,b);
        a = a / m;
        b = b / m;
    }
    
    public boolean equals(Rational other) {
        int p = other.geta();
        int q = other.getb();        
        return ((((double) a) / ((double) b)) == (((double) p) / ((double) q)));
    }

    public Rational mult(Rational other) {
        int p = other.geta();
        int q = other.getb();
        Rational nRat;
        nRat = new Rational(a*p,b*q);
        nRat.reduce();
        return nRat;
    }

    public int compareTo(Rational other) {
        int p = other.geta();
        int q = other.getb();
        
        double c = ((double) a) / ((double) b);
        double r = ((double) p) / ((double) q);

        if (c > r) {
            return 1;}
        else {
            if (c == r) {
                return 0;}
            else {
                return -1;}
        }
    }
}

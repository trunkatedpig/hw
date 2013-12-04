import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Rational r1,r2,r3,r4;
        r1 = new Rational(243/9);
        r2 = new Rational(27,672);
        r3 = new Rational(16,80);
        r4 = new Rational(23,77);

        System.out.println(r3.getab()); 
        System.out.println(r3.gcd(r3.geta(),r3.getb())); 
        r3.reduce();
        System.out.println(r3.getab()); 
        
        System.out.println(r2.equals(r4));
        System.out.println(r3.equals(r2)); 
        
        Rational r5 = r1.mult(r2);
        System.out.println(r5.getInfo()); 

        System.out.println(r1.compareTo(r3)); 
        System.out.println(r1.compareTo(r2)); 
        System.out.println(r5.compareTo(r1)); 
    }
}

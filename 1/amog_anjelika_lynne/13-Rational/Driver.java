import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args){
	Rational r = new Rational(3,4);
	Rational t = new Rational(6,8);
	int n = t.getNumerator();
	int d = t.getDenominator();
	t.gcd(n,d);
	System.out.println("" + t);
    }
}
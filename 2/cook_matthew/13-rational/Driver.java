import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Rational g= new Rational(3,4);
	Rational h= new Rational(3,10);
	Rational q= new Rational(6,8);
       System.out.println(g.equals(q));
	System.out.println(g.equals(h));
	Rational i= g.mult(h);
	System.out.println(i.getA());
	System.out.println(i.getB());
        System.out.println(q.compareTo(g));
	System.out.println(h.compareTo(g));
	System.out.println(g.compareTo(h));
	System.out.println(q.compareTo(h));

    }
}
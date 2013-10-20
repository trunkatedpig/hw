import java.io.*;    
import java.util.*;

public class Driver{
    public static void main (String[] args){
	Rational d,e,f;
	d = new Rational(1,2);
	e = new Rational(2,3);
	f = new Rational(2,4);
	//System.out.println(d.getA());
	System.out.println(d.ratNum());
	System.out.println(d.equals(e));
	System.out.println(d.equals(f));
	System.out.println((d.mult(f)).ratNum());
	System.out.println(d.compareTo(e));
    }
}


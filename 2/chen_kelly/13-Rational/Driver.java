import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Rational r1,r2, r3, r4;
	r1 = new Rational(4,4);
	r2 = new Rational(4,4);
	r3 = new Rational(5,4);
	r4 = new Rational(3,4);
 
	System.out.println(r1.getA());
	System.out.println(r1.getB());
	System.out.println(r1.getR());
	System.out.println("should be true:"+ r1.equals(r2));
	System.out.println("should be false:" + r1.equals(r3));
	System.out.println("should be 0:" + r1.compareTo(r2));
	System.out.println("should be 1:" + r1.compareTo(r4));
	System.out.println("should be -1:" + r1.compareTo(r3));


    }
}

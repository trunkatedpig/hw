import java.util.*;
import java.io.*;


public class Driver{
    public static void main(String[] args){
	Rational r, r1;
	r= new Rational (12, 20);
	r1= new Rational(100, 225);

	System.out.println(r.compareTo(r1));
	System.out.println(r.equals(r1));
	System.out.println(r1.compareTo(r));
	System.out.println(r.mult(r1));


}



}
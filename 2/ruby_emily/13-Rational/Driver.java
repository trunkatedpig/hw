import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Rational r,r2;
	r=new Rational(4,3);
	r2=new Rational(7,6);
	System.out.println(r.equals(r2));
	System.out.println(r.mult(r2));
	System.out.println(r.compareTo(r2));
    }
}

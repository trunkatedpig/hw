import java.io.*;
import java.util.*;


public class Driver{
    public static void main(String[] args){
	Rational n1, n2, n3;
	n1 = new Rational(2, 3);
	n2 = new Rational(5, 4);
	n3 = new Rational(10,8);
	System.out.println(n1.equals(n2));
	System.out.println(n2.equals(n3));
	System.out.println(n1.mult(n2));
	System.out.println(n1.compareTo(n3));
	System.out.println(n2.compareTo(n3));
	}
}
    

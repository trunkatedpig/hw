import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
	Rational x = new Rational(20,19);
	Rational x1 = new Rational(20,19);
	Rational y = new Rational(3,4);
	Rational z = new Rational(1,2);
	System.out.println(x.equals(x1));
	System.out.println(z.mult(y));
	System.out.println(x.compareTo(x1));
	System.out.println(z.compareTo(y));
	System.out.println(y.compareTo(z));
    }
}

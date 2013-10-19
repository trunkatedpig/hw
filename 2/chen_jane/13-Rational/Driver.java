import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	Rational r1,r2;
	r1 = new Rational(4,8); // something wrong with gcd
	r2 = new Rational (1,2); // fix tomorrow
	System.out.println(r1.equals(r2));
	System.out.println(r1.getNum());
	System.out.println(r2.getNum());
	System.out.println(r1.getDen());
	System.out.println(r2.getDen());
    }
}

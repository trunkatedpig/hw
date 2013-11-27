import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Rational R = new Rational(4, 5);
	Rational S = new Rational(6, 8);
	System.out.println(S);
	S.reduce();
	System.out.println(S);
	System.out.println(R.equals(S));
	System.out.println(R.mult(S));
	System.out.println(R.compareTo(S));
    }
}

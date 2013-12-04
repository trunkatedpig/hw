import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args){

	Rational i,j,k;

	i = new Rational(1,2);
	j = new Rational(2,5);
	k = new Rational(5,10);

	System.out.println(i.equals(j));
	System.out.println(i.equals(k));
	System.out.println(i.mult(j).getC());
	System.out.println(i.compareTo(k));
    }
}

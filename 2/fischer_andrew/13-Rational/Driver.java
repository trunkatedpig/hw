import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args){
	Rational x = new rational(1,2);
	Rational y = new rational(200,400);
	Rational z = new rational(39,291);


	System.out.println (x.getRational ());
        System.out.println (y.getRational ());
        System.out.println (z.getRational ());
        
        System.out.println (x.equals (y));
        System.out.println (y.equals (z));
        System.out.println (z.equals (x));

        System.out.println (x.mult (z).getAB());
        System.out.println (y.mult (x).getAB ());
        System.out.println (z.mult (x).getAB ());


        System.out.println (x.compareTo (z));
        System.out.println (y.compareTo (x));
        System.out.println (z.compareTo (x));


    }
}
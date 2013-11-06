import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Rational Luke = new Rational(3,9);
	Rational Skywalker = new Rational(5,25);
	Rational Han = new Rational(8,4);
	Rational Solo = new Rational(7,4);
	System.out.println(Luke.getRational());
	System.out.println(Skywalker.getRational());
	System.out.println(Skywalker.equals(Luke));
	System.out.println(Luke.equals(Skywalker));
	System.out.println(Skywalker.mult(Luke));
	System.out.println(Luke.mult(Skywalker));
	System.out.println(Skywalker.compareTo(Luke));
	System.out.println(Luke.compareTo(Skywalker));
	System.out.println(Han.getRational());
	System.out.println(Solo.getRational());
	System.out.println(Han.equals(Solo));
	System.out.println(Solo.equals(Han));
	System.out.println(Han.mult(Solo));
	System.out.println(Solo.mult(Han));
	System.out.println(Han.compareTo(Solo));
	System.out.println(Solo.compareTo(Han));
    }
}
    

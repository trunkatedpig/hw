import java.io.*;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Rational x = new Rational(5,3);
		Rational y = new Rational(9,6);
		System.out.println(x.equals(y));
		System.out.println(x.compareTo(y));
	}
}
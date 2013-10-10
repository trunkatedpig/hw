import java.io.*;
import java.util.*;

public class Driver {	
	public static void main(String args[]) {
		Loops l;
		l = new Loops();
		System.out.println(l.fact(5));
		System.out.println(l.fact(7));
		System.out.println(l.fact2(5));
		System.out.println(l.fact2(7));
		System.out.println(l.gcd(36, 90));
		System.out.println(l.gcd2(36, 90));
	}

}

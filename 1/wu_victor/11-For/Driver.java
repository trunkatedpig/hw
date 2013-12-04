import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	Loops a = new Loops();
	System.out.println(a.gcd(12, 15));
	System.out.println(a.gcd(12, 17));

	System.out.println("------------------------------");

	System.out.println(a.reverse("racecar"));

	System.out.println("------------------------------");

	System.out.println(a.table(5,5));
	System.out.println(a.table(10,10));
	
    }
}

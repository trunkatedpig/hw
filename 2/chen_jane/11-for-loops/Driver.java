import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
	For c = new For();
	System.out.println(c.isPrime(2));
	System.out.println(c.isPrime(34));
	System.out.println(c.isPrime(250));
	System.out.println(c.isPrime(37));

	System.out.println("------------------");

	System.out.println(c.Reverse("hello"));
	System.out.println(c.Reverse("goodbye"));
	System.out.println(c.Reverse("racecar"));

	System.out.println("------------------");

	System.out.println(c.table(5,3));
	System.out.println("------------------");
	System.out.println(c.table(9,9));

    }
}

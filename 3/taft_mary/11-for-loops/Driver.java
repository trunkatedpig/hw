import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {

	For f = new For();

	System.out.println("GCD of 8 and 12: " + f.gcd(8,12));
	System.out.println();
	System.out.println("Reverse of \"Hello\": " + f.reverse("Hello"));
	System.out.println();
	System.out.println("3x5 times table: \n\n" + f.table(5,3));

    }
}

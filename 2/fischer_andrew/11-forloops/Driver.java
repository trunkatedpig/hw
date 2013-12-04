import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	
	For x = new For();
	
	System.out.println("It is " + x.isPrime(6) + " that the number is prime.");
	System.out.println("Reverse of Hello is " + x.Reverse("Hello"));
	System.out.println();
	System.out.println(x.table(4,2));
    }
}

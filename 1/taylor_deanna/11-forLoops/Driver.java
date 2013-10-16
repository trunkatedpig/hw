import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	For s = new For();
	System.out.println(s.isPrime(47));
	System.out.println(s.isPrime(100));
	
	System.out.println(s.Reverse("Hello"));
	System.out.println(s.Reverse("Deanna"));	
	
	System.out.println(s.table(5,3));
	System.out.println(s.table(3,5));
    }
}

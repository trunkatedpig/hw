import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	For f1,f2,f3;
	
	f1 = new For();
	boolean result = f1.isPrime(17);
	System.out.println(result);
	f2 = new For();
	String result2 = f2.Reverse("word");
	System.out.println(result2);
	
    }
}

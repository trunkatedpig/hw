import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String args[]){
	Loops n = new Loops();
	System.out.println(n.fact(6));
	System.out.println(n.fact2(6));
	System.out.println(n.GCD(3,15));
	System.out.println(n.GCD2(21,7));
	System.out.println(n.isPrime(313));
    }
}

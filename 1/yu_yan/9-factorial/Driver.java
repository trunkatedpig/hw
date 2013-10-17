import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	loops n= new loops();
	System.out.println(n.fact(5));
	System.out.println(n.factw(5));
	System.out.println(n.GCD(12,8));
	System.out.println(n.GCD2(12,8));
	System.out.println(n.isPrime(21));
	System.out.println(n.isPrime(97));
    }
}

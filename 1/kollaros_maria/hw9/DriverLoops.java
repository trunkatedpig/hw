import java.io.*;
import java.util.*;

public class DriverLoops{
    public static void main(String[] args){
	Loops harry = new Loops();
	Loops ron = new Loops();
	Loops hermione = new Loops();
	System.out.println(harry.fact(7));
	System.out.println(ron.fact(4));
	System.out.println(hermione.fact(9));
	System.out.println(harry.fact2(7));
	System.out.println(ron.fact2(4));
	System.out.println(hermione.fact2(9));
	System.out.println(harry.GCD3(8,12));
	System.out.println(ron.GCD3(10,15));
	System.out.println(harry.GCD(8,12));
	System.out.println(ron.GCD2(8,12));
	System.out.println(hermione.GCD2L(8,12));
	System.out.println(harry.GCD(9,21));
	System.out.println(ron.GCD2(9,21));
	System.out.println(hermione.GCD2L(9,21));
	System.out.println(harry.GCD(81,36));
	System.out.println(ron.GCD2(81,36));
	System.out.println(hermione.GCD2L(81,36));
	System.out.println(harry.isPrime(1));
	System.out.println(harry.isPrime(100));
	System.out.println(harry.isPrime(7907));

    }
}
	
	

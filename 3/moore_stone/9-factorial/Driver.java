import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String args[]){
	Factorial f1,f2,f3;
	int n1,n2,n3;
	f1 = new Factorial(3);
	f2 = new Factorial(7);
	f3 = new Factorial(-4);
	n1 = f1.getInt();
	n2 = f2.getInt();
	n3 = f3.getInt();
	System.out.println(f1.fact(n1));
	System.out.println(f2.fact(n2));
        System.out.println(f3.fact(n3));
    }
}

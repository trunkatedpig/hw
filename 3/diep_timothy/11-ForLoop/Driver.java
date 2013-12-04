import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	For f = new For();
	
	System.out.println("1! = " + f.factf(1));
	System.out.println("2! =  " + f.factf(2));
	System.out.println("4! =  " + f.factf(4));
	System.out.println("10! =  " + f.factf(10));
	System.out.println();
	System.out.println("'Hello' backwards is: " + f.reverse("Hello"));
	System.out.println("'TIMOTHY' backwards is: " + f.reverse("TIMOTHY"));
	System.out.println("'timothy' backwards is: " + f.reverse("timothy"));
	System.out.println("'OcToPuS' backwards is: " + f.reverse("OcToPuS"));
	System.out.println();
	System.out.println("5x3 table: ");
	System.out.println(f.table(5,3));
	System.out.println();
	System.out.println("10x10 table: ");
	System.out.println(f.table(10,10));
			   
    }
}

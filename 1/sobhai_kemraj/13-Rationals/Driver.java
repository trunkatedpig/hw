import java.io.*;
import java.util.*;

public class Driver{
	public static void main (String [] args){
		Rationals R1=new Rationals(1,2);
		Rationals R2=new Rationals(1,3);
		Rationals R3=new Rationals(2,4);
		Rationals R4=new Rationals(1,5);
		Rationals R5=new Rationals(2,6);
		Rationals R6=new Rationals(1,7);
		Rationals R7=new Rationals(2,8);
		Rationals R8=new Rationals(1,4);
		Rationals R9=new Rationals(1,0);
		System.out.println(R1.equals(R1));
		System.out.println(R1.equals(R2));
		System.out.println(R1.equals(R3));
		System.out.println(R2.equals(R5));
		System.out.println(R8.equals(R7));
		System.out.println("-------------------------------------");
		//System.out.println((R2.mult(R3)).compareTo(R1.mult(R2)));
		//System.out.println((R3.mult(R3)).compareTo(R1.mult(R2)));
		//System.out.println((R7.mult(R3)).compareTo(R1.mult(R2)));
		//System.out.println((R1.mult(R2)).a);
		//System.out.println((R1.mult(R2)).b);
		System.out.println(R1.compareTo(R2));
		System.out.println(R2.compareTo(R1));
		System.out.println(R1.compareTo(R3));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

	}
}

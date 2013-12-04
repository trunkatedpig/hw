import java.util.*;
import java.io.*;

public class Driver {
    public static void main (String[] args) {
	
	Arrays2 a = new Arrays2();

	System.out.println(a.RevFill(10));
	System.out.println(a.PrintArray(a.RevFill(10)));
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

	System.out.println(a.MakeRandom(9,3,16));
	System.out.println(a.PrintArray(a.MakeRandom(9,3,16)));
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

	int[] sample = new int[];
	sample = {5,3,4,2,13,2,2};
	System.out.println(a.sum13(sample));
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	
    }
}



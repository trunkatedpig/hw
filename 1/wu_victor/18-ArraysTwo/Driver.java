import java.util.*;
import java.io.*;

public class Driver {
    public static void main (String[] args) {
	Arrays a = new Arrays();
	/*
	System.out.println(a.RevFill(1));
	System.out.println(a.RevFill(5));
	System.out.println(a.RevFill(15));

	System.out.println("-------");
	System.out.println("-------");
	System.out.println("-------");
	*/
	/*
	System.out.println(a.MakeRandom(1, 20, 30));
	System.out.println(a.MakeRandom(5, 2, 12));
	System.out.println(a.MakeRandom(15, 2, 100));

	System.out.println("-------");
	System.out.println("-------");
	System.out.println("-------");
	*/

	System.out.println("List X: ");
	int[] x = a.MakeRandom(5, 20, 30);
	System.out.println("List Y: ");
	int[] y = a.MakeRandom(12, 1, 30);
	System.out.println("List Z: ");
	int[] z = a.MakeRandom(20, 0, 100);

	System.out.println("-------");
	System.out.println("-------");
	System.out.println("-------");

	System.out.println(a.modThree(x));
	System.out.println(a.modThree(y));
	System.out.println(a.modThree(z));
	
    }
}

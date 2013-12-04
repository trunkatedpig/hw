import java.util.*;
import java.io.*;

public class Driver{
    public static void main (String[] args) {
	Arrays a = new Arrays();

	//Revfill
	for (int i = 0; i < a.Revfill(5).length; i = i + 1) {
	    System.out.print(a.Revfill(5) [i] + " ");
	}

	System.out.println("");

	//MakeRandom
	for (int i = 0; i < a.MakeRandom (5,10,20).length; i = i + 1) {
	    System.out.print(a.MakeRandom (5,10,20)[i] + " ");
	}

	System.out.println("");

	//sum13
	int [] b = {1,2,3,4,13};
        System.out.println(a.sum13 (b));

        System.out.println("");

	//modThree
	int [] c = {2,4,6,8};
	int [] d = {3,5,7,9};
	int [] e = {2,4,5,7};
	System.out.println(a.modThree (c));
	System.out.println(a.modThree (d));
	System.out.println(a.modThree (e));
    }
}

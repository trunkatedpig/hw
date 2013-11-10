import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {

	Array a = new Array();
	int[] b = {1, 2, 4, 3, 5, 10, 13, 17, 9};

	System.out.println(a.Revfill(5));
	System.out.println(a.makeRandom(5, 3, 10));
	System.out.println(a.sum13(b));
	System.out.println(a.modThree(b));

    }

}
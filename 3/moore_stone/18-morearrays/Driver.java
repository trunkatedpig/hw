import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String args[]) {
	arrays2 test = new arrays2();
	int[] result = test.RevFill(4);
	System.out.println(result[0]);
	System.out.println(result[1]);
	System.out.println(result[2]);
	System.out.println(result[3]);
	int[] result2 = test.MakeRandom(5,23,87);
        System.out.println(result2[0]);
	System.out.println(result2[1]);
	System.out.println(result2[2]);
	System.out.println(result2[3]);
	System.out.println(result2[4]);	
    }
}

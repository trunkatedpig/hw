import java.io.*;
import java.util.Arrays;

public class Driver{
    public static void main (String[] args){

	ArrayStuff a = new ArrayStuff();
	
	int[] b = a.RevFill(5);
	int[] c = a.RevFill(10);
	System.out.println(Arrays.toString(b));
	System.out.println(Arrays.toString(c));
	int[] d = a.MakeRandom(5, 1, 9);
	System.out.println(Arrays.toString(d));
	

    }
}

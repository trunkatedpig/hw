import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Array a = new Array();
	System.out.println(Arrays.toString(a.RevFill(5)));
	System.out.println(Arrays.toString(a.MakeRandom(5,10,20)));
	int[] b = {1,2,2,1};
	int[] c = {2,1,3,5};
	System.out.println(a.sum13(b));
	System.out.println(a.modThree(c));
    }
}
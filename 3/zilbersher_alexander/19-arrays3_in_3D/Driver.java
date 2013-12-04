import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	Arrays3 array = new Arrays3();
	double[]a = {1, 2, 13, 2, 1, 13};
	double[]b = {9, 2, 5, 4, 12, 7, 8, 11, 9, 3, 7, 4, 12, 5, 4, 10, 9, 6, 9, 4};
	System.out.println(array.mean(a));
	System.out.println(array.mean(b));
	System.out.println(array.stddev(a));
	System.out.println(array.stddev(b));
    }
}
import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	Arrays array = new Arrays();

	int[]a = {7, 7, 7};
	int[]b = {3, 8, 0};
	System.out.println(array.printArray(array.middleWay(a,b)));

	int[]c = {1, 2, 2, 2, 2, 2, 2, 3};
	System.out.println(array.printArray(array.makeEnds(c)));

	System.out.println(array.printArray(array.fizzArray(4)));
	System.out.println(array.printArray(array.fizzArray(0)));

	int[]d = {1, 4, 1, 4};
	int[]e = {1, 4, 2, 4};
	System.out.println(array.only14(d));
	System.out.println(array.only14(e));
    }
}
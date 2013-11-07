import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	Arrays2 array = new Arrays2();
	int[]a = {1, 2, 13, 2, 1, 13};
	int[]b = {9, 9, 9};
	int[]c = {8, 3, 4, 2, 6};
	System.out.println(array.printArray(array.Revfill(4)));
        System.out.println(array.printArray(array.makeRandom(5,10,20)));
	System.out.println(array.sum13(a));
	System.out.println(array.modThree(a));
	System.out.println(array.modThree(b));
	System.out.println(array.modThree(c));
    }
}
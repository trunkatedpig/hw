import java.io.*;
import java.util.*;

public class sortsdriver{
    public static void main(String[] args){
	
	sorts g = new sorts();
	int[] a = {5,3,67,2,11,787,3,6,1};
	System.out.println(Arrays.toString(a));
	g.bubbleSort(a);
	System.out.println(Arrays.toString(a));
	int[] b = {5,3,67,2,11,787,3,6,1};
	System.out.println(Arrays.toString(b));
	g.insertionSort(b);
	System.out.println(Arrays.toString(b));
	int[] c = {5,3,67,2,11,787,3,6,1};
	System.out.println(Arrays.toString(c));
	g.selectionSort(c);
	System.out.println(Arrays.toString(c));
    }
}

import java.io.*;
import java.util.*;

public class bubbledriver{
    public static void main(String[] args){
	
	bubblesort b = new bubblesort();
	int[] a = {5,3,67,2,11,787,3,6,1};
	System.out.println(Arrays.toString(a));
	b.bubble(a);
	System.out.println(Arrays.toString(a));
    }
}

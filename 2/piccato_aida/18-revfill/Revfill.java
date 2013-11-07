import java.util.*;
import java.io.*;

public class Revfill {
    public void makeRandom (int n, int min, int max){
	Random r = new Random();
	int[] array = new int[n];
	for (int i = 0; i < n; i++) {
	    array[i] = r.nextInt(min) + (max - min);
	}
	System.out.println(array);
    }
}

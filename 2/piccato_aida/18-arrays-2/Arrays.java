import java.util.Arrays;
import java.io.*;

public class Revfill {
    public int[] makeRandom(int size, int min, int max) {
	Random r = new Random();
	int [] newArray = new int[size];
	for (int i = 0; i < size; i ++) {
	    newArray[i] = r.nextInt(max - min) + min;
	}
	return newArray;	
    }
}




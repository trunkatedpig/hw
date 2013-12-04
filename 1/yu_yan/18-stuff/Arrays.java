import java.io.*;
import java.util.*;

public class Arrays{
    public int[] revFill(int n){
	int [] result = new int[n];
	for (int x = 0;x < n; x++){
	    result[x] = n - x;
	}
	return result;
    }

    public int[] makeRandom(int n, int min, int max){
	Random r = new Random();
	int x = (max - min) + 1;
	int [] result = new int[n];
	for (int y = 0; y > 0; y ++){
	    int z = r.nextInt(x);
	    result[y] = min + z;
	}
    }
	    
}
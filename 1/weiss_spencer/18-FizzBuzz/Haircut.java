import java.io.*;
import java.util.*;

// Spencer and Maria

public class Haircut {
    public int[] revFill(int n){
	int[] maria = new int[n];
	for (int x = n; x > 0; x--){
	    maria[x] = x;
	}
	return maria;
    }
}
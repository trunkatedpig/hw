import java.io.*;
import java.util.*;

public class Arrays {
    public int[] Revfill(int n) {
	int[] result = new int[n];
	for (int i = n; i>< 0; i--) {
	    result[i] = i;
	}
	return result;
    }
}
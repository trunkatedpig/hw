import java.io.*;
import java.util.*;

public class Arrays {
    public int[] Revfill(int n) {
	int[] a = new int[n];
	for (n; n > 0; n--) {
	    a[n] = n;
	}
	return a;
    }
}
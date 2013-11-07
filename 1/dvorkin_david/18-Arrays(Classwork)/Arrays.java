import java.io.*;
import java.util.*;
import java.math.*;

public class Arrays{
    // "Driver" - hah
    public static void main(String args[]) {
	Revfill(5);
    }
    // Junk for array generation in reverse style with int
    public static void Revfill(int n) {
	int[] q = new int[n];
	for (int i = n; i > 0; i--){
	    q[n-i] = i;
	}
	System.out.println(q);
    }
}

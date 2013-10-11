import java.io.*;
import java.util.*;

public class Loops2 {
    public int gcd(int A, int B) {
	int smaller = B;
	int common = smaller;
	if (B > A)
	    smaller = A;
	while (A % smaller != 0 && B % smaller != 0){
	    smaller = smaller - 1;
	    System.out.println(smaller);
	}
	return A %  smaller;
	}
}
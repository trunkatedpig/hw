import java.io.*;
import java.util.*;

public class Loops {
	
	public static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		else {
			return (n * (fact(n-1)));
		}
	}
	
	public static int fact2(int n) {
		int result = 1;
		if (n == 0) {
			result = 1;
		}
		else {
			while (n > 0) {
				result = result * n;
				n = n - 1;
			}
		}
		return result;
	}
}
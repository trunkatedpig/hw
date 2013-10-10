import java.io.*;
import java.util.*;

public class Loops {
	private int total;
	public int fact (int n) {
		if (n <= 1) {
			return 1;
		}
		else {
			return n * fact(n - 1);
		}
	}
	public int fact2 (int n) {
		total = 1; //resets total everytime this is called
		while (n >= 1) {
			total = total * n;
			n = n - 1;
		}
		return total;
	}
}
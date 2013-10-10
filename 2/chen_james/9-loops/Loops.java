import java.io.*;
import java.util.*;

public class Loops {

	private int ans = 1;
	
	public int fact (int n) {
		if (n == 0) {
			return 1;
		}
		return n * fact (n-1);
	}
		
	public int fact2 (int n) {
		
		while (n != 0) {
			ans = ans * n;
			n--;
		}
		return ans;
	}
}

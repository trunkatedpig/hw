import java.io.*;
import java.util.*;

    public class Loops {
	
	public int fact(int n) {
	    int result;
	    if (n != 1 && n > 0) {
		result = n * fact(n-1);
	    }
	    else {
		result = 1;
	    }
	    return result;
	}
	
	public int fact2(int n) {
	    int result = 1;
	    while (n != 1 && n > 0) {
		result = result * n;
		n = n - 1;
	    }
	    return result;
	}
    }

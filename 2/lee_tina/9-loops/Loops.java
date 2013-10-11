import java.io.*; 
import java.util.*;

public class Loops {
    int result = 1;
    public int fact(int n) {
	if (n >= 1) {
		result = result * n;
		return fact(n - 1);
	    }
	else
	    return result;
    }
    public int fact2(int n) {
	while (n >= 1) {
		result = result * n;
		n = n - 1;
	    }
	return result;
    }
}
	

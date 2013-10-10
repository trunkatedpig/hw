import java.util.*;
import java.io.*;

public class Loops {
    public int fact2 (int n) {
	int currentNum = 1;
	while (n > 0) {
	    currentNum = currentNum * n;
	    n = n - 1;
	}
	return currentNum;
	}

    public int fact (int n) {
	if (n == 1 || n == 0) {
	    return 1;
	}
	else {
	    return n * fact(n - 1);
        }	
    }
}


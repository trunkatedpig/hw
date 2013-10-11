import java.io.*;
import java.util.*;

public class Loops {

    public int fact(int n) {
	if (n == 1 || n == 0) {
	    return 1;
	}
	else {
	    return n * fact(n-1);
	}
    }

    public int fact2(int n) {
	int product = 1;
	while (n > 1) {
	    product = product * n;
	    n = n-1;
	}
	return product;
    }
}

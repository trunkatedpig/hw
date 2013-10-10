import java.io.*;
import java.util.*;

public class Loops {

    private int product = 1;

    public int fact(int n) {
	if (n == 1) {
	    return product;
	} else {
	    product = product * n;
	    fact(n-1);
	}
	return product;
    }
    
    public int fact2(int n) {
	while (n != 1) {
	    product = product * n;
	    n = n - 1;
	}
	return product;
    }
}
	    

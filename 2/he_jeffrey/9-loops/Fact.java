import java.util.*;
import java.io.*;

public class Fact {

    public int fact(int n) {
	if (n > 1) {
	    return n * fact(n-1);
		} else {
	    return 1;
	}
    }
    
    public int fact2(int n) {
	int product = 1;
	while (n > 1) {
	    product = product * n;
	    n = n - 1;
	}
	return product;
    }
}

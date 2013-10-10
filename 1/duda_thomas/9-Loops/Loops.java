import java.util.*;
import java.io.*;

    public class Loops {
	public int m;

	public int fact(int n) {
	    if (n == 0) {
		return 1;
	    } else {
		return n * fact(n - 1);
	    }
	}

	public int fact2(int n) {
	    m = 1;	   
	    while (n > 0);
	    this.m = (n - 1);
	    return n * fact2(m);
	}
    }
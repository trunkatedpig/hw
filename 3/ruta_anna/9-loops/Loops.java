import java.io.*;
import java.util.*;

public class Loops {

	private int factorial;

/* A recursive factorial method */
	public int fact(int n) {
		if (n > 1)
			factorial = n * fact(n-1);
		else
			factorial = 1;
		return factorial;
	}

/* A loop factorial method */
	public int fact2(int n) {
		factorial = 1;
		while (n >= 1){
			factorial = factorial * n;
			n = n-1;
			}
		return factorial;
	}

}

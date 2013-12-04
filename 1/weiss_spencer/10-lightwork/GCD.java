import java.io.*;
import java.util.*;

// Worked with Andrew Sikowitz

public class GCD{
    public static int gcd(int a, int b){
	if (b==0) {
	    return a;
	}
	return gcd(a, b%a);
    }
}


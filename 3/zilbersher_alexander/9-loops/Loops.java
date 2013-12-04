import java.io.*;
import java.util.*;

public class Loops{

    public int fact(int n){
	if (n <= 1) {
	    return n;
	} else {
	    return n * (fact(n-1));
	}
    }
    
    public int fact2(int n){
	if (n <=1) {
	    return n;
	}
	int output = 1;
	while (n > 1) {
	    output = output*n;
	    n = n-1;
	}
	return output;
    }
}
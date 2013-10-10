import java.io.*;
import java.util.*;

public class Factorial {
    
    public int fact(int n) {
	if (n < 0) {
	    return 0;}
	else {
	    if (n > 0) {
		return n * fact(n-1);}
	    else {
		return 1;}
	}
    }

    public int fact2(int n) {
	int returnint = 1;
	
	if (n < 0) {
	    return 0;}
	else {
	    if (n == 0) {
		return 1;}
	    else {
		while (n > 0) {
		    returnint = returnint * n;
		    n = n - 1;}
		return returnint;}
	}
    }
}

	    

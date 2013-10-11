import java.io.*;
import java.util.*;

public class Loops{
    public int fact(int n){
	int result = n;
	if (n > 1) {
	    result = result * fact(n-1);
	} else if (n == 0) {
	    result = 0;
	} else {
	    result = 1;
	}
	return result;
    }
    public int fact2(int n){
	int i = n;
	int result = n;
	while (i > 1) {
	    result = result * (i-1);
	    i = i -1;
	}
	return result;
	    
}
}
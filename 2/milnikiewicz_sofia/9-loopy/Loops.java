import java.io.*;
import java.util.*;

public class Loops {
    private int s;

    public int fact(int n){
	if (n == 0){
	    return 1;
	}
	else {
	    return n * fact(n-1);
	}	
    }
    
    public int fact2(int n){
	s = 1;
	while (n>0){
	    s = s * n;
	    n = n - 1;
    }
	return s;
    }
}

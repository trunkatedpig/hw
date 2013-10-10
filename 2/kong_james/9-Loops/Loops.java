import java.io.*;
import java.util.*;

public class Loops {
    public int fact(int n){
	if (n <= 1){
	    return n;
		}
	else {
	   return  n * fact(n-1);
	}
    }
    public int fact2(int n){
	int end = 1;
	while ( n >= 1){ 
	    end = end * n;
	    n = n - 1;
	}
	return end;
    }
}

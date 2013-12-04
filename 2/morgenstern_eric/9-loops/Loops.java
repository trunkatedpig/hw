import java.io.*;
import java.util.*;

public class Loops {
    private int current;
    public Loops(){
	current= 1;
    }
    public int fact(int n){
	if (n == 1){
	    String x = "hi";
	}
	else {
	    current = current * n;
	    fact(n-1);
	}
	return current;
    }
    public int fact2(int n){
	current = 1;
	while (n>1){
	    current = current * n;
	    n = n-1;
	}
	return current;
    }
}

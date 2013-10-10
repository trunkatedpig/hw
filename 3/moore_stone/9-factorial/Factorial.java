import java.io.*;
import java.util.*;

public class Factorial{
    private int n;
	
    public Factorial(int x){
	n = x;
    }
    
    public int getInt(){
	return n;
    }

    public int fact(int x){
	int r;
	r = 1;
	while (x > 0){
	    r = r * x;
	    x = x - 1;
	}
	return r;
    }
}

import java.io.*;
import java.util.*;

public class Loop {
    public int fact(int n) {
	int result;
	if (n ==1) 
	    result = 1;
	else
	    result = n * fact(n-1);
	return result;
    }

    public int fact2(int n) {
	int result, count, fact;
	count = n;
	fact = 1;
	while (count != 1) {
	    fact = fact*count;
	    count = count - 1;
	}
	return fact;
    }

    public static void main(String[] args) {
	Loop l = new Loop();
	System.out.println(l.fact(7));
	System.out.println(l.fact2(7));
    }
	    
	    




}

import java.io.*;
import java.util.*;

public class loops{
    public int fact(int n){
	int x;
	if (n == 0)
	    x = 1;
	else
	    x = n*(fact(n-1));
	return x;
    }
    
    public int factw(int n){
	int x = 1;
	if (n == 0)
	    x = x * 1;
	while (n > 0){
	    x = x * n;
	    n = n - 1;
	}
	return x;
    }

    // Vanessa Yan and Elise Zlotnikova
    private int l,s;
    public int GCD(int A, int B) {
	if (A < B){
	    l = B;
	    s = A;
	}
	else{
	    l = A;
	    s = B;
	}
	int x = s;
	while (l%x != 0 || s%x != 0)
	    x = x - 1;
	return x;
    }

    public int GCD2(int A, int B) {
	if (A < B){
	    l = B;
	    s = A;
	}
	else{
	    l = A;
	    s = B;
	}
	int x;
	if (s == 0)
	    return l;
	else {
	    int r = l%s;
	    x = GCD(s,r);
	}
	return x;
    }
}

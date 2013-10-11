import java.io.*;
import java.util.*;

// vanessa yan elise zlotnikova

public class Numbers {
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

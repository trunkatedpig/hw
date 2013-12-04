import java.io.*;
import java.util.*;

public class Loops {
    public int fact(int n){
	if (n == 0){
	    return  1;
	}
	else {
	    return n * fact(n-1);
	}
    }

    public int fact2(int n){
	int f;
	f = 1;
	while (n > 0){
	    f = f * n;
	    n = n - 1;
	}
	return f;
    }
}
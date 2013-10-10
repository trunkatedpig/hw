import java.io.*;
import java.util.*;

public class Loops{
    private int a;
    
public int fact(int n){
    if (n > 0){
	return n*(fact(n-1));
}
    if (n < 0) {
	return 0 ;
}
    else{
	return 1;
    }
}

    public int fact2(int n){
	a = n;
	while (n > 0){
	    n = n-1;
	    a = a*(n - 1);
	}
	return a;
}
}

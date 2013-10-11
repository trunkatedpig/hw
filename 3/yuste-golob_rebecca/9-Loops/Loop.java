import java.io.*;
import java.util.*;

public class Loop{
    public int fact(int n){
	int result = 1;
	if (n == 0){
	    result = 1;
	} else if (n ==1){
	    result = n * result;
	} else{
	    result = n * (n-1);
	    n = n-1;
	    fact(n);
	}
	return result;
    } 

    public int fact2(int n){
	int result = 1;
	while (n >= 1){
	    result = result * n;
	    n = n - 1;
	}
	return result;
    }


}

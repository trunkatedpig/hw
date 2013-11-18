import java.io.*;
import java.util.*;

public class Loops{
    private int result;

    public int fact(int n){
	if (n==2){
	    return 2;
	}
	else {
	    return n*fact(n-1);
    }
    }
    public int fact2(int n){
	result=1;
	while (n>=1) {
	    result=result*n;
	    n=n-1;}
	return result;
    }
}
import java.io.*;
import java.util.*;

public class Loops {

    private int outcome = 1 ;
    //need to set outcome to 1 because
    //otherwise, it is already set to 0

    //recursion
    public int fact(int n){
	if (n == 1) {
	    return 1;}
	return n * fact(n-1);
    }

    //while
    public int fact2(int n){
	while (n != 0) {
	    outcome = outcome * n;
	    n = n - 1;
	}
	return outcome;
    }	
}
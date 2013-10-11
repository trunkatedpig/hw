import java.io.*;
import java.util.*;

public class Loops {
    
    public int GCD (int a, int b) {
	int greater;
	int less;
	if (a > b) {
	    greater = a;
	    less = b;
	}
	else if (a < b) {
	    greater = b;
	    less = a;
	}
	else
	    return a;

	while (greater % less != 0){
	        less = less - 1;
	    }     
	return less;

    }
    public int GCD2 (int a, int b) {
	int greater;
	int less;
	int r;
	if (a > b) {
	    greater = a;
	    less = b;
	}
	else if (a < b) {
	    greater = b;
	    less = a;
	}
	if (less == 0) {
	    return greater
		}
	els
    }
}

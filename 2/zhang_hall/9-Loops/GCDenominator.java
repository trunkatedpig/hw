import java.io.*;
import java.util.*;

public class GCDenominator{

    public int GCD(int a, int b){
	int counter = b;
	if (a >= b){
	    if (a % b == 0){
		return b;
	    }
	    else{
		counter = counter - 1;
		if (b % counter == 0){
		    return counter;
		}
		else{
		    return GCD(a,counter);
		}
	    }
	}
	else{
	    return GCD(b,a);
	}
    }

}

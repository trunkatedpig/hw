//Andrew Fischer

import java.io.*;
import java.util.*;

public class loops {
    private int count, result;


    public int fact(int n) {
	count = n;
	result = n;
	while (count > 0) {
	    result = result * count;
	    count = count - 1;
	}
	return result/n;
    }


    public int fact2(int n) {
	count = n;
	while (count != 0) {
	    result = n * (n-1);
	    count = count - 1;
	}
	return result;
    }
    
}

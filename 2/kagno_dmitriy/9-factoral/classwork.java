import java.io.*;
import java.util.*;

public class classwork{
    private int count;
    
    public int GCD(int small,int big){
	
       	if (((small%big) == 0)&&((small%small) == 0)){
	    return small;}
	else {
	    count = small
	    return GCD(count - 1,big);
	    } 
	return 0;
    }
    
    public int GCD2(int a, int b) {
	int r;
	while (b!=0) {
	    r = a % b;
	    a = b;
	    b = r;
	}
	return a;
    }


    }
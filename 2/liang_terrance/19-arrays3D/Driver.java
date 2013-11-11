import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	double[] test  = new double[10];
	ArrayStuff a = new ArrayStuff();
	test[0]=1;
	test[1]=4;
	test[2]=6;
	test[3]=7;
	test[4]=3;
	test[5]=2;
	test[6]=6;
	test[7]=10;
	test[8]=12;
	test[9]=0;
	System.out.println("For the array: " + Arrays.toString(test) + "\n The mean is: " + a.mean(test));
	System.out.println("For the array: " + Arrays.toString(test) + "\n The standard deviation is: " + a.stddev(test));





    }
}



import java.io.*;
import java.util.*;

public class Bubble{
    public double[] sort(double[] a){
	for (int i=a.length;i>0;i--){
	    for (int n=0;n<i-1;n++){
		if (a[n]>a[n+1]){
		    double[] q={a[n]};
		    a[n]=a[n+1];
		    a[n+1]=q[0];
		}
	    }
	}
	return a;
    }

    public static void main(String[] args){
	Bubble t=new Bubble();
	double[] tt={8,3.1,4,10,6,12,9,4,5};
	System.out.println(Arrays.toString(t.sort(tt)));
    }
}
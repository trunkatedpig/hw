import java.util.*;
import java.io.*;

public class ArrayStuff{
    private int[] a;
    private Random r = new Random();
    public ArrayStuff() {
        a=new int[5];
        for (int i=0;i<a.length;i++) {
            a[i]=r.nextInt(100);
        }
    }

    public String toString() {
        return Arrays.toString(a);
    }

    // return the index of the max element
    public int findMaxIndex() {
        if (a==null || a.length==0) 
            return -1;

               int maxi = 0;
        for (int i=0;i<a.length;i++) {
            if (a[i] > a[maxi])
                maxi = i;
        }
        return maxi;
    }

    public int get(int n) {
        if (n>=0 && n < a.length) 
            return a[n];
        else
            return -1;
    }
    public int find(int n) {
        for (int i=0;i<a.length;i++) {
            if (a[i]==n)
                return i;
        }
        return -1;
    }
	
	//PART 1 OF HW
	
	public double mean(){
		if (a==null || a.length==0)
			return 0;
		double sum=0;
		for (int i=0; i<a.length; i++){
			sum = sum + a[i];
		}
		return sum/a.length;
	}
	
	//PART 2 OF HW
	
	public double stddev(){
		double mean1=mean();
		double sumOfSquares=0;
		for (int i=0; i<a.length; i++){
			double b=mean1-a[i];
			sumOfSquares=sumOfSquares + Math.pow(b, 2);
		}
		double mean2=sumOfSquares/a.length;
		return Math.pow(mean2, 0.5);		
	}

}
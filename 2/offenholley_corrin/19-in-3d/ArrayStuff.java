import java.io.*;
import java.util.*;

public class ArrayStuff {
    private int[] a;
    private Random r;

    public ArrayStuff() {
        r = new Random();
        a = new int[20];
        for (int i=0;i<a.length;i++) 
            a[i]=r.nextInt(100);
    }

    public String toString() {
        return Arrays.toString(a);
    }

    public int get(int n) {
        return a[n];
    }

    public int findMaxIndex() {
        int maxi = 0;
        for (int i =0 ; i < a.length;i++) {
            if (a[i]>a[maxi]) 
                maxi = i;
        }
        return maxi;
    }

    public int find(int n) {
        for (int i=0;i<a.length;i++) {
            if (a[i]==n)
                return i;
        }
        return -1;
    }
    public double mean(int[] nums){
	//I know, it shouldn't have parameters, but a helper function makes the next function a lot easier to make.
	int ans=0;
	int i=0;
	while (i<nums.length){
	    ans+=nums[i];
	    i+=1;
	}
	double trueans = 0.0;
	trueans=(double)ans;
	trueans=trueans/nums.length;
	return trueans;
    }
    public double mean2(double[] nums){
	double ans=0.0;
	int i=0;
	while (i<nums.length){
	    ans+=nums[i];
	    i+=1;
	}
	return ans;
    }
    public double stddev(){
	double avg = mean(a);
	int i=0;
	double[] ans;
	ans = new double[20]
	while (i<a.length){
	    ans[i]=(a[i]-avg)*(a[i]-avg);
	    i+=1;
	}
	avg=mean2(ans);
	avg=Math.sqrt(avg);
	return avg;
    }
}

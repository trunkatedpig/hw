import java.io.*;
import java.util.*;

public class ArrayStuff2{

    public int[] RevFill(int n){
	int[] result=new int[n];
	for (int i=0;i<n;i++){
	    result[i]=n-i;
	}
	return result;
    }

    public int[] MakeRandom(int size, int min, int max){
	Random r = new Random();
	int[] result = new int[size];
	for (int i=0;i<size;i++){
	    result[i]=(r.nextInt(max-min)+min);
	}
	return result;
    }

    public int sum13(int[] nums) {
	int n=nums.length;
	int sum = 0;
	for (int i=0;i<n;i++){
	    if (nums[i]!=13)
		sum=sum+nums[i];
	    else
		i=i+1;
	}
	return sum;
    }
   
    public boolean modThree(int[] nums) {
	int evens = 0;
	int odds = 0;
	for (int i = 0; i<nums.length;i++){
	    if (nums[i]%2==0){
		evens=evens+1;  
		odds=0;
	    }
	    else{
		odds=odds+1;
		evens=0;
	    }
	    if (evens==3||odds==3)
		return true;
	}
	return false;
    }
    
}

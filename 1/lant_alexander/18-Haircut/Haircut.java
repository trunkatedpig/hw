import java.io.*;
import java.util.*;

public class Haircut{

    public int[] RevFill(int n){
	int[] ret = new int[n];
	for(int i = n; i > 0 ; i --){
	    ret[n-i] = i;
	}
	return ret;
    }
  
    public int[] MakeRandom(int n, int min, int max){       
	int[] array = new int[n];
        Random r = new Random();
        for(int i = 0; i < n ; i ++){
            array[i] = r.nextInt(max) + min;
        }
        return array;
    }   

    public int sum13(int[] nums) {
	int sum = 0;
	int i = 0;
	while(i < nums.length){
	    if (nums[i] != 13)
		sum = sum + nums[i];
	    else
		i ++;  
	    i ++;
	}
	return sum;
    }
 
    public boolean modThree(int[] nums) {
	int count = 1;
	for (int i = 1;i < nums.length; i ++){
	    if (count < 3){
		if ((nums[i] % 2) == (nums[i -1] % 2))
		    count ++;
		else 
		    count = 1;
		
	    }
	    if (count >=3)
		return true;
	}
	return false;
    }
        

    public String sum(int n){
       	int sum = 0;
	for(int i = n; i > 0; i --){
	    sum = sum + i;
	}
	return even(sum);
    }
    
    public String even(int n){
	if(n % 2  == 0)
	    return message(true, n);
	else
	    return message(false, n);

    }
    public String message(boolean b, int n){
	String ret = "";
	if (b)
	    ret = (n + " is even");
	else 
	    ret = (n + " is odd");
	       
	return ret;
    }
}
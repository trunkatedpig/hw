import java.io.*;
import java.util.*;

public class Arrays_three{

    public double mean(int[] nums){
	double sum = 0.0;
	for (int i= 0; i<nums.length; i++){
	    sum = sum + nums[i];
	}
	double average = sum/nums.length;
	return average;
    }

    public double stddev(int[] nums){
	double average = mean(nums);
	int[] subtractMean = new int[nums.length];
	for (int i=0; i<nums.length; i++){
	    int value = nums[i] - (int)average;
	    subtractMean[i] = value;
	}
	int[] squareArray = new int[nums.length];
	for (int j=0; j<nums.length; j++){
	    int value = subtractMean[j];
	    int square = value^2;
	    squareArray[j] = square;
	    }
	double averageTwo = mean(squareArray);
	double result = Math.sqrt(averageTwo);
	return result;
	// I'm really not sure why this doesnt give the correct answer
	// I made a new array after each step and after going over the 
	// code, I really dont get why it doesnt produce the correct answer.
    }
}

    

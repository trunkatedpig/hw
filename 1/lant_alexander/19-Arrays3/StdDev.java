import java.io.*;
import java.util.*;

public class StdDev{
    
    private  Random R = new Random();
    private int length = 100;
    private int range = 100; //Range is 0 to "range".
    private double[] ARR = new double[length];
    
    public StdDev(){
    for (int i = 0; i < length; i++){
	ARR[i] =  R.nextInt(range);
	system.out.print(ARR[i]);
	//I feel like something else should go here...
    }   
    System.out.println(sttdev(ARR));
    }
    
    
    public double mean(double[] array){ 
        double sum = 0; 
	for (int i = 0; i < array.length; i ++){
	    sum = sum + array[i];            
	} 
	return (sum/array.length);
    }       
    
    public double stddev(double[] array){
	//array = new double [];
	double[] temp = new double[array.length];
	double mean = mean(array);
	for (int i = 0; i < array.length; i ++)
	    temp[i] = ((array[i] - mean) ^ 2);   
	int result = sqrt(mean(temp));
	//return result;
    }
    
}
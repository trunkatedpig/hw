// Spencer and Maria

import java.io.*;
import java.util.*;

public class Haircut{
    
    public int[] RevFill(int n){
	int[] Spencer = new int[n];
	int Cheese = 0;
	int y = n;
	while(Cheese < y){
	    Spencer[Cheese] = n;
	    n = n - 1;
	    Cheese = Cheese + 1;
	}
        for (int j = 0; j < Spencer.length; j = j + 1){
	    System.out.println(Spencer[j]);
	}
	return Spencer;
    }

    public int[] MakeRandom(int size, int min, int max){
	Random r = new Random();
	int[] Gale = new int[size];
	for (int i = 0; i < size; i = i + 1){
	    Gale[i] = r.nextInt(min) + (max - min);
	}
	for (int j = 0; j < Gale.length; j = j + 1){
	    System.out.println(Gale[j]);
	}
	return Gale;
    }


    public int sum13(int[] nums) {
	int sum = 0;
	if (nums.length == 0){
	    return 0;
	}
	else{
	    for (int i = 0; i < nums.length; i = i + 1){
		if (nums[i] != 13 && i == 0){
		    sum = sum + nums[i];
		}
		else if (nums[i] != 13 && nums[i - 1] != 13){
		    sum = sum + nums[i];
		}
	    }
	    return sum;
	}
  
    }

    public boolean modThree(int[] nums) {
	String result = "";
	for (int i = 0; i < nums.length; i = i + 1){
	    if ((nums[i] % 2) == 0){
		result = result + "t";
	    }
	    else{
		result = result + "f";
	    }
	}
	if (result.contains("ttt") || result.contains("fff")){
	    return true;
	}
	else{
	    return false;
	}
  
    }

}

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
}
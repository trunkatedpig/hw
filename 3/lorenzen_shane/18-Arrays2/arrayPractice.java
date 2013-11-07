import java.util.*;
import java.io.*;

public class arrayPractice{
    public int[] revFill(int n){
	int[] ans = new int[n];
	int i;
	for (i=0;i<n; i++){
	    ans[i]= n-i;
	} 
	return ans;
    }
    public int[] makeRandom(int n, int min, int max){
	int[] ans = new int[n];
    }
}
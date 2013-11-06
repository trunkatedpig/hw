import java.io.*;
import java.util.*;

public class Arrays2{

    public int[] RevFill(int n){
	int[] ans;
        ans = new int[n];
	int i = 0;
	while(i<n){
	    ans[i] = n-i;
	    i +=1;
	}
	return ans;
    }

    public int[] makeRandom(int n, int min, int max){
	int[] ans;
	ans = new int[n];
	for(int i = n; i>0; i--){
	    r = (int)(math.random()*max + min);
	    ans[i-1] = r;
	}
	return ans;
    }


}
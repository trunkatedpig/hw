import java.io.*;
import java.util.*;

public class arrayStuff2 {

    public int[] refill(int n) {
	int ans[];
	int i;
	ans = new int[n];
	for (i=n; i!=0; i--) {
	    int count = 0;
	    ans[i] = n-count;
	    count ++;
	}
	return ans;
    }
}
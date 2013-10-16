import java.util.*;
import java.io.*;

public class For{
    public int fact(int n){
	int x = 1;
	for (n=n; n > 0; n--){
	    x = x * n;
	}
	return x;
    }

    public String reverse(String s){
	String x = "";
	int l = s.length();
	for (l = l; l>0; l--){
	    x = x + s.substring(l-1, l);
	}
	return x;
    }
}

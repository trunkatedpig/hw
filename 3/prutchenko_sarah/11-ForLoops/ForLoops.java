import java.util.*;
public class ForLoops{
    public int gcd(int a, int b){
	if (a>b){
	    int c = b;
	    while ((a % c != 0) || (b % c != 0)){
		c = c-1;
		}
	    return c;
	    }
	else {
	    int c = a;
	    while ((b % c != 0) || (a % c != 0)){
	        c = c -1;
		}
		return c;
	    }
	}
    public boolean isPrimeF(int n){
	for (int other = (int)Math.round(Math.sqrt(n)); other > 1; other --){
	    if (gcd (n, other)> 1){
		return false;
		}
	    }
	    return true;
	}
    public String Reverse(String s){
	String n = "";
        for (int len = s.length(); len > 0; len--){
	    n = n + s.substring(len-1 , len);
	    }
	    return n;
	}
    public String table(int n, int m){
        String  Final = "";
	for (int c = 0; c <= m; c++){
	    if (c != 0){
		Final = Final + c + " ";
	    }
	    for (int v=1; v <= n; v++){
		if (c==0){
		    Final = Final+ v + " ";
		}
		else{
		    Final = Final + c*v + " ";
		}
	    }
	    Final = Final + "\n";
	}
	return Final;
    }
    
}	
		  
	   


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
        for (int len = s.length()-1; len > 0; len--){
	    n = n + s.substring((len-1), len);
	    }
	    return n;
	}
    public String table(int n, int m){
        String  Final = "";
	int c = 0;
	for (int c ; c < (m+1); c++){
	    for (int j = 1; j < (nm + 1); j+c){
		Final = Final + "" + j + " ";
	    }
	    return Final;
       	}
	return "\n";
	    }
    
}	
		  
	   


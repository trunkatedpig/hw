import java.io.*;
import java.util.*;

public class Loops {
    public int fact(int n){
	if (n == 0)
	    return 1;
	else 
	    return n * fact(n - 1);
    }

    public int fact2(int n){
	int ans = 1;
	/*while loop
	  while (n > 0) {
	    ans = ans * n;
	    n = n - 1;
	    }
	*/
	for(n = n;n > 0;n = n - 1)
	    ans = ans * n;
	return ans;
    }

    public int GCD(int a, int b){
	int t = a;
	if (a > b)
	    t = b;
	while (a%t != 0 || b%t != 0){
	    t = t - 1;
	}
	return t;
    }

    public int GCD2(int a, int b){
	int x = a;
	int y = b;
	if (a <  b){
	    x = b;
	    y = a;
	}
	while (y != 0){
	    int t = x;
	    x = y;
	    y = t%y;
	}
	return x;
    }

    public boolean isPrime(int n){
	int t = (int)(Math.sqrt(n));
	boolean b = true;
	if (n == 1)
	    return false;
	while (t > 1){
	    if (n%t == 0)
		b = false;
	    t = t - 1;
	}
	return b;
    }

    /*
      public void test(){
	//int i = 100;
	for (int i = 0;i<10;i++){

	}
	System.out.println(i);
	}*/

    public String backwards(String s){
	String ans = "";
	for (int i = s.length();i>0;i=i-1){
	    ans = ans + s.substring(i-1,i);
	}
	return ans;
    }
}

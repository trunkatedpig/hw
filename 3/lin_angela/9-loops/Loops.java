public class Loops {

    public int fact(int n) {
	 if (n == 0){
	     return 1;
	 }
	 return n*fact(n-1);
    }

    public int fact2(int n) {
	int result = 1;
	while (n>1) {
	    result = result * n;
	    n = n - 1;
	}
	return result;
    }


    /*if a%b ==0 then b is a divisior of a;*/ 
    public int gcd(int a, int b){
	int gcd = 1;
	if (a == b){
	    return a;
    } else {
	gcd = b;
	while (gcd >=1 && a%gcd != 0 ||  b%gcd != 0) {
		gcd = gcd -1;
	    }
	}
	return gcd;
    } 


    /* for gcd2: if b = 0, the gcd is a
otherwise, the gcd of (a,b) is the gcd (b,r) where r is the remainder of a/b (that is, a%b)
    */

    public int gcd2(int a, int b){
	int r = 0;
	int gcd = 1;
	if (b == 0 || a==0){
	    gcd = a;
	    return gcd;
	}
	else if (a==b){
	    return a;
	}else {
	    r = a%b;
	    return gcd2(b,r);
	}

    }

    public boolean isPrime(int n){
	double squareRoot =(Math.sqrt(n));
	int sR = (int)(squareRoot);
	int factor = 2;
	boolean answer=false;
	if (n==1 || n==2) {
	    answer = true;
	    //	} else if (n%2==0) {
	    //answer = false;	   
	}else{
	while (factor<=squareRoot) {
	    if (gcd(factor,n)==1){
		factor = factor +1;
		answer=true;
	    }else{
		factor = sR+1;
		answer= false;
	    }
	}
	}
	return answer;
    }
    
}

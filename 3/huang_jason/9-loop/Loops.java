public class Loops{

    public int fact(int n){
	if (n <= 1){
	    return n;
	}
	else{
	    return (n * (fact(n-1)));
	}
    }

    public int fact2(int n){
	if (n <= 1){
	    return n;
	}
	int ans = n;
	while (n > 1){
	    n = n-1;
	    ans = ans * n;
	}
	return ans;
    }

 //Michael Lim and Isaac Gluck helped me a lot in class

    public int gcd(int a, int b){
	int c;
	if (a>b)
	    c = b;
	else
	    c = a;

	while (a%c!=0 || b%c!=0)
	    c = c-1;

	return c;
    }

    public int gcd2(int a, int b){
	while (b != 0){
	    int r = a%b;
	    return gcd2(b,r);
	}
	return a;
    }

    public boolean isPrime(int n){
	int count = n-1;
	while (count>1) {
	    if (n%count==0)
		return false;
	    else
		count = count-1;
	}
	return true ;
    }	
}
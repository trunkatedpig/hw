public class Loops {
    public int fact(int n) {
	if (n==0) {return 1;} 
	else {return n*fact(n-1);}
    }
    public int fact2(int n) {
	int r=1;
	while (n>0) {
	    r=r*n;
	    n=n-1;
	}
	return r;
    }
    public int gcd(int a, int b) {
	int c=a;
	if (b<a)
	    c = b;
	while (a%c!=0 || b%c!=0) 
	    c=c-1;
	return c;
    }
    public int gcd2(int a, int b) {
	int r = 1;
	while (b!=0) {
	    r=a%b;
	    a=b;
	    b=r;
	}
	return a;
    }
    public boolean isPrime(int n) {
	int i=2;
	if (n<2)
	    return false;
	while (i<n) {
	    if (n%i==0) 
		return false;
	    i=i+1;
	}
	return true;
    }
}

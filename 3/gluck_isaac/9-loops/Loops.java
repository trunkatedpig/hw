public class Loops {
    public int fact(int n) {
	if (n==0)
	    return 1;
	else if (n==1)
	    return 1;
	else
	    return n * fact(n-1);
    }
    public int fact2(int n) {
	if (n==0)
	    return 1;
	int total = 1;
	while (n != 0) {
		total = total * n;
		n = n-1;
	    }
	return total;
    }

    public int gcd(int a, int b) {
	int c;
	if (a>b)
	    c = b;
	else
	    c = a;
	
	while (a%c!=0 || b%c!=0)
	    c = c-1;
	
	return c;
    }

    public int gcd2(int a, int b) {
	if (a==0) {
	    a=b;
	    b=a;
	}
	while (b != 0) {
	    int r = a%b;
	    return gcd2(b,r);
	}
	return a;
    }

    public boolean isPrime(int n) {
	int count = n-1;
	while (count>1) {
	    if (n%count==0)
		return false;
	    else
		count = count -1;
	}
	return true ;
    }
}

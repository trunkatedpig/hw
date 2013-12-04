public class Loop {
    public int gcd(int a,int b) {
	int m;
	m = Math.min(a,b);
	while (m > 1) {
	    if (a % m == 0 && b % m == 0) {
		return m;
	    }
	    else {
		m = m - 1;
	    }
	}
	return m;
    }
    
    public int gcd2(int a,int b) {
	int r;
	while (b > 1) {
	    if (a% b == 0) {
		return b;
	    }
	    else {
		r = a% b;
		a = b;
		b = r;
	    }
	}
	return b;
    }

    public boolean isPrime(int n) {
	int sqrt = (int) Math.sqrt(n);
	while (sqrt > 1) {
	    if (n % sqrt == 0) {
		return false;
	    } else {
		sqrt = sqrt - 1;
	    }
	}
	return true;
    }
    
    // Not based off of a loop, but rather uses regex. Just me playing around.
    public static boolean isPrime2(int n) {
	return !new String(new char[n]).matches(".?|(..+?)\\1+");
    }
    // If I have time, maybe I'll mess around with Agrawal–Kayal–Saxena primality test.
}
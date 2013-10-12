public class Loop {
    
    public int gcd(int a, int b) {
	int tryN;
	if (a > b) {
	    tryN = b;
	} else {
	    tryN = a;
	}
	while (tryN > 1) {
	    if (a % tryN == 0 && b % tryN == 0) {
		return tryN;
	    } else {
		tryN = tryN - 1;
	    }
	}
	return tryN;
	
    }
	
    public int gcd2(int a, int b) {
	int r;
	while(b != 0) {
	    r = a % b;
	    a = b;
	    b = r;
	}
	return a;
    }

    public boolean isPrime(int n) {
	// I'm not sure whether negatives count as prime. This assumes they don't
	int tryN;
	tryN = n - 1;
	while (tryN > 1) {
	    if (n % tryN == 0)
		return false;
	    tryN -= 1;
	}
	return true;
    }
}

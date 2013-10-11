public class Loops {
    public int fact(int n) {
	int c = n;
	int answer = 1;

	while (c > 0) {
	    answer = answer*(c);
	    c--;
	}

	return answer;
    }

    public int GCD(int a, int b) {
	if (a == b)
	    return a;
	return gcd(a, b%a);
    }

    public Boolean isPrime(int n) {
	for (int i=0; i<n; i++) {
	    if (n%i == 0)
		return false;
	}
	return true;
    }
}
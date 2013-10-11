public class Loops {
    
    public int fact (int n){
	if (n == 0 || n == 1){
	    return 1;
	}
	return n*fact(n-1);
    }

    public int fact2 (int n){
	int answer = 1;
	while (n > 1){
	    answer = answer * n;
	    n = n - 1;
	}
	return answer;
    }

    public int gcd(int a, int b){
	int n;
	if (a>b)
	    n = b;
	else
	    n = a;
	while (a%n!=0 || b%n!=0)
	    n = n-1;
	return n;
    }

    public int gcd2(int a, int b){
	while (b!=0){
	    int r = a%b;
	    return gcd2(b,r);
	}
	return a;
    }

    public boolean isPrime(int n){
	int count = n-1;
	while (count > 1){
	    if (n%count==0)
		return false;
	    else
		count = count -1;
	}
	return true;
    }
}
	

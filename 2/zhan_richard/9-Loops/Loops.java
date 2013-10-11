public class Loops{
    public int fact(int n){
	if (n > 1){
	    return n * fact(n-1);
	}
	else{
	    return 1;
	}
    }
    public int fact2(int n){
	int result = 1;
	while (n > 1){
	    result = result * n;
	    n = n - 1;
	}
	return result;
    }
    public int GCD(int a, int b){
	int result = 0;
	boolean inWhile=true;
	if (a>b){
	    result = b;
	}
	else {
	    result = a;
	}
	while (inWhile){
	    if ((a % result == 0) && (b % result == 0)){
		inWhile=false;
	    }
	    else {
		result = result - 1;
	    }
	}
	return result;
    }
    public int GCD2(int a, int b){
	//not too sure
	int r;
	while (b != 0){
	    r=b;
	    b = a%b;
	    a = r;
	}
	return a;
    }
    public boolean isPrime(int a){
	int largestRoot=1;
	int i = 1;
	boolean result = true;
	while (largestRoot < a){
	    largestRoot = i * i;
            i = i + 1;
	}
	while (i > 1){
	    if (a % i == 0){
		result = false;
		i = 0;
	    }
	    else{
		i = i - 1;
	    }
	}
	return result;
    }
}

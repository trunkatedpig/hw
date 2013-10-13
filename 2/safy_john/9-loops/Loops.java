public class Loops {
    public int fact (int n) {
	if (n <= 1)
	    return 1;
	else return n * fact(n-1);
    }

    public int fact2 (int n) {
	int Fact = 1;
	while (n > 1) {
	    Fact = Fact * n;
	    n = n - 1;
	}
	return Fact;
    }
    
    public int GCD (int a, int b) {
	int smallernum, biggernum;
	if (a > b) {
	    smallernum = b;
	    biggernum = a;
	}
	else {
	    smallernum = a;
	    biggernum = b;
	}
	
	if (biggernum % smallernum == 0) {
	    return smallernum;
	}
	else {
	    return  GCD(biggernum, (smallernum - 1));}}
    
    public int GCD2 (int a, int b) {
	int r, smallernum, biggernum;

	if (a > b) {
	    smallernum = b;
	    biggernum = a;
	}
	else {
	    smallernum = a;
	    biggernum = b;
	}
	
	r = biggernum % smallernum;

	while (r != 0) {
	    biggernum = smallernum;
	    smallernum = r;}
	return smallernum;}
    
    public boolean isPrime (int n){
	int r = 2;
	
	if (n <= 1) {
	    return false;}

	while ((n/2) > r) {
	    if (n%r == (0)){
		return false;}
	    r = r + 1;}
	return true;
    }}

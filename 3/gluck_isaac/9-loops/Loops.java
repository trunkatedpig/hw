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
}

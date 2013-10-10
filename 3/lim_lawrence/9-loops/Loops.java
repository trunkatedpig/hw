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
}

public class Loops{
    public int fact(int n){
	if (n<=1){
	    return n;}
	else {return n*fact(n-1);}
    }

    public int fact2(int n){
	int count=n-1;
	int answer=n;
	    while (count>0){
	    answer=answer*count;
	    count=count-1;
	    }
	return answer;
    }

    public int gcd(int a, int b){
	int rn=Math.min(a,b);
	while (rn>=1){
	    if (a%rn==0 && b%rn==0)
		return rn;
	    else
		{rn=rn-1;}}
	 return -1;}


public int gcd2(int a, int b) {
        int c = Math.min(a,b);
	int d = Math.max(a,b);
	if (c<0)
	    return -1;
	if (c == 0) {
	    return d;
	}
	else {
	    return gcd2(c, d%c);}
}

    public int gcd3(int a, int b){
	int c=Math.min(a,b);
	int d=Math.max(a,b);
	while (c>0){
	    return gcd3(c,d%c);
	}
	return d;

    }
    public int gcd4(int a, int b){
	int c=Math.min(a,b);
	int d=Math.max(a,b);
	while (c>0){
	    int dd=d;
	    d=c;
	    c=dd%c;
	}
	return d;

    }
    public boolean isPrime(int n) {
	int rn=n-1;
	while (rn>1){
	    if (n%rn==0)
		return false;
	    rn=rn-1;
	}
	return true;
    }
    }

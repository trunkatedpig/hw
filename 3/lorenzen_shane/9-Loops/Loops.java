public class Loops{
    
    public int fact(int n){
	if (n < 1)
	    return 1;
	else 
	    {
		return n*fact(n-1);
	    }
	     
    }
    
    public int fact2(int n){
	int ans;
	ans = 1;
	while (n>1){
	    ans = n*ans;
	    n = n-1;
	}
	return ans;
    }

    public int gcd(int a, int b){
	int c;
	if (a>b){
	    c=b;
	}
	else{ 
	    c=a; }
	while (c>0){
	    if ((a%c)==(b%c) && (a%c)==0){
		return c;}
	    c=c-1;}
	return c;
    }

    public int gcd2(int a, int b){
	if (a==0){
	    return b;
	}
        if (b==0){
	    return a;
	}
	else return gcd2(b,a%b);
    }

    public int secondGcd2(int a,int b){
	while ((a!=0)&&(b!=0)){
	    return secondGcd2(b,a%b);
	}
	return Math.max(a,b);
    }

    public boolean isPrime(int n){
	int d = 0;
	int t = n;
	while (t > 0){
	    if (n%t==0){
		d = d+t;
	    }
	    t = t-1;
	}
	return (d==n+1);
    }

    public boolean isPrime2(int n){
	int d, t;
	d = 0;
	for (t=n;t>0;t--){
	    if (n%t==0){
		d=d+t;
	    }
	}
	return (d==n+1);
    }
   }


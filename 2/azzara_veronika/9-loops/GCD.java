public class GCD{
    public static void main (String [] args){
	GCD g = new GCD();
	System.out.println(g.GCD(12,8));
	System.out.println(g.GCD2(12,8));
	System.out.println(g.isPrime(13));
	System.out.println(g.isPrime(14));
    }
    public int GCD(int a, int b){
	int d = a>b?b:a;
	while (d>1){
	    if (a%d==0 && b%d==0)
		return d;
	    else
		d=d-1;
	}
	return d;
    }
    public int GCD2(int a, int b){
	int r;
	if(a < b){
	    int temp = b;
	    b = a;
	    a = temp;
	}
	while (b!=0){
	    r = a % b;
	    a = b;
	    b = r;
	}
	return a;
    }

	public boolean isPrime(int n)
	{
		for(int i = n - 1; i > 1; i--)
		{
			if(GCD2(n,i) != 1)
				return false;
		}
		return true;
	}
		
}

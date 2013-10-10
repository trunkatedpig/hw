public class Loops{
    
    public int fact(int n){
        if (n == 1)
            return n;
        else
            return n * fact(n - 1);
    }

    public int fact2(int n){
        int counter = 1;
        int ans = 1;
        while (counter <= n){
            ans = ans * counter;
            counter++;
        }
        return ans;
    }

    public int gcd(int a, int b){
	int counter;
	if (a >= b){
	    counter = a;
	}else{
	    counter = b;
	}
	boolean div = false;
	while (div == false){
	    if (a % counter == 0 && b % counter == 0){
		div = true;
	    }else{
	    	counter --;
	    }
	}
	return counter;
	
   }
   public int gcd2(int a, int b){
	if (b == 0){
	    return a;
	}else{
	    return gcd(b,a%b);
	}
   }
}

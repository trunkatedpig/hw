public class GCD {
	

	public int gcd1(int a, int b){
		int greater;
		int less;
		if (a > b){
			greater = a;
			less = b;
		}
		else if (b > a){
			greater = b;
			less = a;
		}
		else{
			return a;
		}
		while (greater % less != 0){
			less = less - 1;
		}
		return less;
	}
	
	public int gcd2(int a, int b){
		int r = a % b;
		
		if (r == 0){
			return b;
		}
		else{
			while (b % r != 0){
				r = r - 1;
			}
			return r;
		}
		
			 
	}



	public boolean isPrime(int n){
		while (n > 1){
			if (n % (n - 1) == 0){
				return false;
			}
			else
				n = n - 1;
		}
		return true;
	}
}

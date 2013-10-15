public class Loops {
	public int fact(int n) {
		if (n == 0) {return 1;}
		else {return n * fact(n - 1);}
	}
	
	public int fact2(int n) {
		int product = 1;
		while (n > 0) {
			product *= n;
			n--;
		}
		
		return product;
	}

	public int GCD(int a, int b) {
		int gcd = Math.min(a, b);
		while (!((a % gcd == 0) && (b % gcd == 0))) {gcd--;}
		
		return gcd;
	}
	
	public int GCD2(int a, int b) {
		int x;
		while (b != 0) {
			x = b;
			b = a % x;
			a = x;
		}
		
		return a;
	}
	
	public boolean isPrime(int n) {
		if (n == 1) {return false;}
		
		int i = 2;
		int max = (int) Math.sqrt(n); //casting to int takes the floor
		while (i <= max) {
			if (n % i == 0) {return false;}
			i++;
		}
		
		return true;
	}
}

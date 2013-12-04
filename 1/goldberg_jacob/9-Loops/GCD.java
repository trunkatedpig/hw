public class GCD{
	private int n;
	public int GCD(int A, int B){
		n = A;
		while (n>1) {
			if ((A%n == 0) && (B%n == 0)) { 
				return n;
				}
			else {
				n = n - 1;
				}}
		return 1;
	}

	public static int GCD2(int A, int B){
		/* Doesn't work yet, as close as I got for a Euclidian method. How would it return last time's B */				
		if (B==0) {
		    return A;
		}
		return GCD2(A, A%B);
    	}

	public boolean isPrime(int b){
		n = (b-1);
		while (n>1) {
			if (b%n == 0){
				return false;
			}
			else{
				n = n-1;
			}
		}
		return true;
	}
}

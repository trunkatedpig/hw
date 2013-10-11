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

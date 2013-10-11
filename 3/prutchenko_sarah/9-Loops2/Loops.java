public class Loops{
    public int gcd(int a, int b){
	if (a > b){
	    int c = b;
	    while (a % c != 0){
		c = c-1;
	    }
	    return c;
		}
	else {
	    int c = a;
	    while (b % c != 0){
		c = c-1;
	    }
	    return c;
	}
    }
}
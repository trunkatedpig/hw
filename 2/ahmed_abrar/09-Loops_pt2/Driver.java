public class Driver {
    public static void main (String[] args ) {
	GCD g = new GCD();
	//System.out.println ( g.gcd ( 54 , 12 ) );
	//System.out.println ( g.gcd2 ( 54 , 12 ) );
	//System.out.println ( g.gcd ( 1223 , 1217 ) );
	//System.out.println ( g.gcd2 ( 1223, 1217 ) );
	//System.out.println ( g.gcd ( 210 , 45 ) );
	// System.out.println ( g.gcd ( 210 , 45 ) );
	System.out.println ( g.gcd ( 492876847 , 533000389 ) );
	System.out.println ( g.gcd2 ( 492876847 , 533000389 ) );
	System.out.println ( g.isPrime ( 492876847 ) );
	System.out.println ( g.isPrime ( 52 ) );
    }
}

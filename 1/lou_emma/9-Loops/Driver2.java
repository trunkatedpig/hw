public class Driver2 {
    public static void main (String[] args){
	Loops2 f2;
	f2 = new Loops2();
	/*System.out.println(f2.gcd(8,12));
	System.out.println(f2.gcd(5,146));
	
	System.out.println(f2.gcd2(8,12));
	System.out.println(f2.gcd2(5,146));
	System.out.println(f2.gcd2(2322,654)); //should return 6*/
	
	System.out.println(f2.gcd(179424821,179567881)); //Takes about 1.5 seconds
	System.out.println(f2.gcd2(179424821,179567881)); //Instant (to the human eye)
	
	System.out.println(f2.isPrime(18));
	System.out.println(f2.isPrime(2));
	//System.out.println(f2.isPrime(179567881));

	System.out.println(f2.isPrime(79));

	
    }
}
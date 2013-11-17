public class Driver{
    public static void main(String[] args){
	int result,result2,result3,result4;
	boolean result5,result6;
	Loops l;
	l = new Loops();
	result = l.fact(4);
	result2 = l.fact2(4);
	result3 = l.gcd(12,8);
	result4 = l.secondGcd2(12,8);
	result5 = l.isPrime(11);
	result6 = l.isPrime2(11);
	System.out.println(result);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
	System.out.println(result5);
	System.out.println(result6);
    }
}
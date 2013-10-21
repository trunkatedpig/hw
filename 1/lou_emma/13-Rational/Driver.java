public class Driver{
	public static void main (String[] args){
	
		Rational r1=new Rational(10,5);
		Rational r2=new Rational(6,3);
		Rational r3=new Rational(15,3);
		
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
		
		System.out.println(r1.mult(r2));
		System.out.println(r2.mult(r3));
		
		System.out.println(r2.compareTo(r3));
		System.out.println(r3.compareTo(r1));
		System.out.println(r1.compareTo(r2));
		
		
	}
}
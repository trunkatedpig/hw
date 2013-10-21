public class Driver{
    public static void main(String[] args){
	Rational r1 = new Rational(3,3);
	Rational r2 = new Rational(1,1);
	System.out.println(r1.getNumerator());
	System.out.println(r1.getDenominator());
	System.out.println(r1.getRational());
	System.out.println(r1.equals(r2));
	System.out.println(r1.mult(r2));
	System.out.println(r1.compareTo(r2));
    }
	
}
public class Driver {
    public static void main(String[] args){
	Rational a = new Rational(5, 6);
	Rational b = new Rational(12, 17);
	
	System.out.println(a.equals(b));
	System.out.println(a.mult(b));
	System.out.println(a.compareTo(b));
	
	System.out.println("Should be false, rational representing 60/102, and 1");
    }
}

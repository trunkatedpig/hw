public class Driver{
    public static void main(String[] args){
	Rational a =new Rational(5,3);
	Rational b = new Rational(8,6);
	System.out.println(a.equals(b));
	System.out.println(a.mult(b).getRations());
	System.out.println(a.compareTo(b));
	Rational c = new Rational(4,3);
	System.out.println(b.equals(c));
	System.out.println(b.compareTo(c));
    }
}

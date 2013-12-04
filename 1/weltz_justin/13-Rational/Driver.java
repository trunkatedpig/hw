public class Driver{
    public static void main(String[] args){
	Rational r = new Rational(3,4);
	Rational m = new Rational(5,6);
	Rational l = r;
	System.out.println(r.equals(m));
	System.out.println(m.equals(r));
	System.out.println(r.mult(m));
	System.out.println(r.mult1(m));
	System.out.println(r.compareTo(m));
	System.out.println(m.compareTo(r));
	System.out.println(r.compareTo(l));
    }
}
	

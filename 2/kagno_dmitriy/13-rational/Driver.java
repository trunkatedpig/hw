public class Driver{
    public static void main(String[] args){
	Rational r = new Rational(21,7);
	Rational s = new Rational(15,5);
	System.out.println(r.equals(s));
	Rational t = new Rational(16,5);
	System.out.println(t.equals(s));
	System.out.println(r.compareTo(s));
	System.out.println(t.compareTo(r));
      	
    }
}

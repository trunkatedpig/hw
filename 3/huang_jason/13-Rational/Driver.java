public class Driver{

    public static void main(String[] args){

	Rational abc = new Rational(20,25);
	Rational def = new Rational(4,5);
	Rational ghi = new Rational(1,24);

	System.out.println(abc.equals(def));
	System.out.println(abc.equals(ghi));

	System.out.println(abc.mult(def));
	System.out.println(abc.mult(ghi));

	System.out.println(abc.compareTo(def));
	System.out.println(abc.compareTo(ghi));

    }
}
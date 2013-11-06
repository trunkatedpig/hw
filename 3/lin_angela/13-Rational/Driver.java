public class Driver {

    public static void main(String [] args){
	Rational r = new Rational(2,3);
	Rational r2 = new Rational(4,5);
	Rational r3 = new Rational(2,3);
	System.out.println(r.getA());
	System.out.println(r.getB());
	System.out.println(r.equals(r2)); //false
	System.out.println(r.equals(r3)); //true
	System.out.println(r.mult(r2));
	System.out.println((r.compareTo(r2)));//-1
	System.out.println((r2.compareTo(r)));//1
	System.out.println(r.compareTo(r3));//0



    }







}

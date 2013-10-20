public class Driver{
    public static void main(String[] args){
	Rational r1 = new Rational(1,2);
	Rational r2 = new Rational(3,6);
	Rational r3 = new Rational(3,7);
	Rational r4 = new Rational(1,26);
	System.out.println(r1.geta());
	System.out.println(r2.geta());
	System.out.println(r3.geta());
	System.out.println(r4.geta());
	System.out.println(r1.getb());
	System.out.println(r2.getb());
	System.out.println(r3.getb());
	System.out.println(r4.getb());
	System.out.println(r1.getc());
	System.out.println(r2.getc());
	System.out.println(r3.getc());
	System.out.println(r4.getc());
	System.out.println(r1.equals(r2));
	System.out.println(r1.equals(r3));
	System.out.println(r2.equals(r1));
	System.out.println(r2.equals(r4));
	System.out.println(r1.mult(r2).getc());
	System.out.println(r3.mult(r4).getc());
	System.out.println(r1.compareTo(r2));
	System.out.println(r1.compareTo(r3));
	System.out.println(r3.compareTo(r4));
	System.out.println(r4.compareTo(r3));
    }
}
	

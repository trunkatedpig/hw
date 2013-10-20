public class Driver {
    public static void main(String[] args) {
	Rational r =  new Rational(3,4);
	Rational r1 = new Rational(75,100);
	Rational r2 = new Rational(0,6);
	Rational r3 = new Rational(49,98);
	Rational r4 = new Rational(2,4);
	Rational r5 = new Rational(1,16);
	Rational r6 = new Rational(29,3);

	//testing equals
	System.out.println(r.equals(r1));
	System.out.println(r.equals(r2));
	System.out.println(r3.equals(r1));
	System.out.println(r3.equals(r4));
	System.out.println(r5.equals(r2));
	System.out.println(r5.equals(r3));
	System.out.println(r6.equals(r1));
	System.out.println(r6.equals(r6));

	//testing mult
	System.out.println(r.mult(r1).getNum()+ "/"+
			   r.mult(r1).getDen());
	System.out.println(r.mult(r2).getNum()+ "/"+
			   r.mult(r2).getDen());
	System.out.println(r3.mult(r4).getNum()+ "/"+
			   r3.mult(r4).getDen());
	System.out.println(r2.mult(r5).getNum()+ "/"+
			   r2.mult(r5).getDen());
	System.out.println(r.mult(r6).getNum()+ "/"+
			   r.mult(r6).getDen());
	System.out.println(r6.mult(r1).getNum()+ "/"+
			   r6.mult(r1).getDen());

	//testing compareTo
	System.out.println(r.compareTo(r1));
	System.out.println(r1.compareTo(r2));
	System.out.println(r2.compareTo(r3));
	System.out.println(r3.compareTo(r4));
	System.out.println(r4.compareTo(r5));
	System.out.println(r5.compareTo(r6));
	System.out.println(r6.compareTo(r));
    }
}

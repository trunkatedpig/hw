public class Driver {
    public static void main ( String[] args ) {
	Rational r = new Rational ( 3 , 4 );
	System.out.println ( r.getNumber() );
	Rational s = new Rational ( 5 , 6 );
	Rational t = new Rational ( 3 , 4 );
	System.out.println ( s.equals ( r ) );
	System.out.println ( t.equals ( r ) );
	System.out.println ( r.mult ( s ).getNumber() );
	Rational u = new Rational ( 1 , 2 );
	System.out.println ( r.compareTo ( s ) );
	System.out.println ( r.compareTo ( t ) );
	System.out.println ( r.compareTo ( u ) );
    }
}

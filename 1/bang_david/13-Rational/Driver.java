

public class Driver {
    public static void main (String [] args){
	Rational m = new Rational (100, 20);
	Rational n = new Rational (50, 10);
	Rational o = new Rational (51, 20);
	
 

	System.out.println (m.getAB ());
	System.out.println (n.getAB ());
	System.out.println (o.getAB ());
	
	System.out.println (m.equals (n));
	System.out.println (n.equals (m));
	System.out.println (m.equals (o));

	System.out.println (m.mult (n).getAB());
	System.out.println (o.mult (n).getAB ());

	System.out.println (m.compareTo (n));
	System.out.println (n.compareTo (o));
	    

    }
}

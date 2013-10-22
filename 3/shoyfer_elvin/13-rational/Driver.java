public class Driver {
    public static void main(String[] args){
    	Rational r1, r2, r3;
    	r1 = new Rational(3,2);
    	r2 = new Rational(6,4);
    	r3 = new Rational(1,2);

    	System.out.println("\n -- Tests for equals -- \n");
    	System.out.println(r1.equals(r2) + "---> true");
    	System.out.println(r1.equals(r3) + "---> false");

    	System.out.println("\n -- Tests for mult -- \n");
    	Rational r4 = r1.mult(r3);
    	System.out.println(r4.getA() + "---> 3");
    	System.out.println(r4.getB() + "---> 4");

    	System.out.println("\n -- Tests for compareTo -- \n");
    	System.out.println(r1.compareTo(r3));
    	System.out.println(r1.compareTo(r2));
    	System.out.println(r3.compareTo(r1));
    	System.out.println("There previous 3 lines should be 1,0,-1");


    }
}
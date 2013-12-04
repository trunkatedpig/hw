public class Driver {
public static void main(String[] args) {
Rational r1,r2,r3;
r1 = new Rational(5);
r2 = new Rational(10,2);
r3 = new Rational(25);
System.out.println(r1.equals(r2));
System.out.println(r1.mult(r2).equals(r3));
System.out.println(r1.compareTo(r2));
}
}
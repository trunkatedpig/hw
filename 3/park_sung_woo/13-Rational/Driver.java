public class Driver{
    public static void main(String[] args){
        Rational r = new Rational (3,4);
        Rational r2 = new Rational (5,6);

        System.out.println(r.equal(r2));
        System.out.println(r.getN());
        System.out.println(r.getD());
        System.out.println(r2.getN());
        System.out.println(r2.getD());

        Rational r3 = r.mult(r2);
        System.out.println(r3.getN());
        System.out.println(r3.getD());

        System.out.println(r.compareTo(r2));

        Rational r4 = new Rational(6,8);
        System.out.println(r.compareTo(r4));
    }
}

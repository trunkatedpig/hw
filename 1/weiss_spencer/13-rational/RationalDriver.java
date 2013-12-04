public class RationalDriver{
    public static void main(String[] args){
        Rational q = new Rational(5,6);
        Rational r = new Rational(10,12);
        Rational s = new Rational(11,3);
        Rational t = new Rational(2,90);
        q.reduce(5,6);
        System.out.println(r.mult(t));
        System.out.println(r.equals(t));
        System.out.println(r.equals(q));
        System.out.println(r.compareTo(q));
        System.out.println(r.compareTo(t));
        System.out.println(r.compareTo(s));
    }}

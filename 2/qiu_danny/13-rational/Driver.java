public class Driver {

    public static void main(String[] args) {
        Rational rat, rat1, rat2;
        rat = new Rational();
        rat1 = new Rational(4, 3);
        rat2 = new Rational(1, 2);

        System.out.println("Random Rational: " + rat.getNum() + " / " + rat.getDen() + " = "+ rat.getApprox());
        System.out.println("Random Rational1: " + rat1.getNum() + " / " + rat1.getDen() + " = "+ rat1.getApprox());
        System.out.println("Random Rational2: " + rat2.getNum() + " / " + rat2.getDen() + " = "+ rat2.getApprox());
        System.out.println("rat1 = rat2? " + rat1.equals(rat2));

        Rational product = rat1.mult(rat2);
        System.out.println("rat1 * rat2 = " + product.getNum() + " / " + product.getDen() + " = " + product.getApprox());

        System.out.println("Comparing Rat1 and Rat2: " + rat1.compareTo(rat2));
    }
}

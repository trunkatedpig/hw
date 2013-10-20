import java.util.*;

public class Rational {

    private int a, b;
    Random r = new Random();

    public Rational() {
        a = r.nextInt(100);
        b = r.nextInt(100);
        reduce();
    }
    
    public Rational(int num, int den) {
        a = num;
        b = den;
        reduce();
    }

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    } 

    public void reduce() {
        a = a / gcd(a, b);
        b = b / gcd(a, b);
    }

    public boolean equals(Rational other) {
        return (this.a == other.a && this.b == other.b);
    }

    public Rational mult(Rational other) {
        int newA, newB;
        newA = this.a * other.a;
        newB = this.b * other.b;
        Rational rat;
        rat = new Rational(newA, newB);
        return rat;
    }

    public int compareTo(Rational other) {
        double rat1, rat2;
        rat1 = ((double) a) / ((double) b);
        rat2 = ((double) other.a) / ((double) other.b);
        if (rat1 < rat2) {
            return -1;
        }
        else if (rat1 == rat2) {
            return 0;
        }
        else {
            return 1;
        }
    }

    public int getNum() {
        return a;
    }

    public int getDen() {
        return b;
    }

    public double getApprox() {
        return ((double) a) / ((double) b);
    }
}

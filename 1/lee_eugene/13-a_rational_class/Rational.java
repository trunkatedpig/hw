public class Rational{
    private int numerator;
    private int denominator;

    Rational(int n, int d){
        numerator = n;
        denominator = d;
    }

    public int getN(){
        return numerator;
    }

    public int getD(){
        return denominator;
    }

    public int gcd(int a,int b){
        if (b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }

    public void reduce(){
        int gcd = gcd(numerator,denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public boolean equal(Rational other){
        reduce();
        other.reduce();
        return  (numerator == other.getN() && denominator == other.getD());
    }

    public Rational mult(Rational other){
        int newN = numerator * other.getN();
        int newD = denominator * other.getD();
        Rational r = new Rational(newN, newD);
        return r;
    }

    public int compareTo(Rational other){
        double a = (double)numerator / denominator;
        double b = (double)other.getN() / other.getD();

        if (a > b){
            return 1;
        }else if(a == b){
            return 0;
        }else{
            return -1;
        }
    }
}

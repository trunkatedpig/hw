public class Loops {

    public int fact(int n) {
        if (n > 0) {
            return n * fact(n - 1);
        }
        else {
            return 1;
        }
    }

    public int fact2(int n) {
        int s;
        s = 1;
        while (n > 0) {
            s = s * n;
            n = n - 1;
        }
        return s;
    }

    public int gcd(int a, int b) {
        int m;
        m = Math.min(a,b);
        while (m > 1) {
            if (a % m == 0 && b % m == 0) {
                return m;
            }
            else {
                m = m - 1;
            }
        }
        return m;
    }

    public int gcd2(int a, int b) {
        int r;
        while (b > 1) {
            if (a % b == 0) {
                return b;
            }
            else {
                r = a % b;
                a = b;
                b = r;
            }
        }
        return b;
    }

    public boolean isPrime(long n) {
        if (n <= 1 || n % 2 == 0) {
            return false;
        }
        long div, end;
        div = 3;
        end = (long) Math.sqrt(n);
        while (div < end) {
            if (n % div == 0) {
                return false;
            }
            else {
                div = div + 2;
            }
        }
        return true;
    }
}

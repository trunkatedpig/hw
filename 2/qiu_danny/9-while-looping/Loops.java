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
}

import java.io.*;
import java.util.*;

public class For {
    public int GCD (int A, int B) {
        int x = 1;
        int result = 1;
        if (A > B) {
            x = B;
        }
        else {
            x = A;
        }
        for (x = x; x > 0; x = x - 1) {
            if ((A % x == 0) && (B % x == 0)) {
                result = x;
                x = 0;
            }
        }
        return result;
    }
 public void funTest () {
        int i = 100;
        for (i = 0; i < 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println(i);
    }
}



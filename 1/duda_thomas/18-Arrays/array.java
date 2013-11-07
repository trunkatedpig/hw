import java.util.*;
import java.io.*;

public class array {

    private Random r = new Random();

    public String printArray (int[] x) {

        int i = 0;

        System.out.print("[");

        for (i = 0; i < x.length; i++) {
            if (i + 1 == x.length) {
                System.out.println(x[i] + "]");
                return "";
            }

            System.out.print(x[i] + ", ");
        }

        System.out.println("]");
        return "";
    }

    public int[] RevFill (int n) {

        int[] m = new int[n];
        int i = 0;

        while (i < n) {
            m[i] = i;
            i = i + 1;
        }

        printArray(m);

        return m;
    }

    public int[] MakeRandom (int size, int min, int max) {

        int[] m = new int[size];
        int i = 0;

        while (i < size) {
            int randNum = r.nextInt(max-min);
            m[i] = min + randNum;
            i = i + 1;
        }

        printArray(m);

        return m;
    }

    public int sum13 (int[] nums) {

        int m = 0;
        int i = 0;

        while (i < nums.length) {

            if (nums[i]!=13) {
                m = m + nums[i];
            }
            else {
                i = i + 1;
            }
            i = i + 1;  }

        return m;
    }

    public boolean modThree (int[] nums) {
        int cEven = 0;
        int cOdd = 0;
        int i = 0;

        while (i < nums.length) {

            if ((nums[i] % 2) == 0) {
                cEven = cEven + 1;
                cOdd = 0;
            }
            else {
                cEven = 0;
                cOdd = cOdd + 1;
            }
            i = i + 1;

            if (cEven == 3 || cOdd == 3) {
                return true;
            }

        }
        return false;
    }
}
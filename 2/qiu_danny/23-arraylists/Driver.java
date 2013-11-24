import java.util.*;

public class Driver {

    public static void main(String[] args) {
        int count, trials;
        if (args.length == 2) {
            count = Integer.parseInt(args[0]);
            trials = Integer.parseInt(args[1]);
        }
        else {
            count = 500000;
            trials = 5;
        }
        long sum;

        ArraysTime a = new ArraysTime(count, trials);

        System.out.println("Adding to an array test:");
        System.out.println("a.add(5): " + a.avgAddList());
        System.out.println("a.add(0, 5): " + a.avgAddBeginList());

        System.out.println("Removing elements from an array test:");
        System.out.println("Remove from end: " + a.avgRemoveList());
        System.out.println("Remove from front: " + a.avgRemoveBeginList());

        System.out.println("Reversing the list: " + a.avgReverse());
    }
}

/* Results
 * -------
 * a.add(5)   took 9     milliseconds
 * a.add(0,5) took 31907 milliseconds
 *
 * Removing from end took   3     milliseconds
 * Removing from front took 31182 milliseconds
 *
 * Reversing the list took 11 milliseconds
 */

import java.util.*;

public class Driver {

    public static void main(String[] args) {
        int length;
        if (args.length == 1) {
            length = Integer.parseInt(args[0]);
        }
        else {
            length = 100;
        }
        Sorts s = new Sorts(length);

        System.out.println("--- Radix Sort ---");
        s.radixSort();

        System.out.println("\n--- Bubble Sort ---");
        s.bubbleSort();

        System.out.println("\n--- Insertion Sort ---");
        s.insertionSort();
    }
}


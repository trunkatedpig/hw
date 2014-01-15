import java.util.*;

public class Sorts {

    private int length;
    private int[] list;
    private long[] longList;
    RandomGen r = new RandomGen();

    public Sorts() {
        length = r.nextInt(100);
        this.list = randomList(length);
    }

    public Sorts(int n) {
        length = n;
        this.list = randomList(length);
    }

    public Sorts(int[] list) {
        length = list.length;
        this.list = list;
    }

    private int[] randomList(int l) {
        int[] nums = new int[l];
        for (int i=0; i<l; i++) {
            nums[i] = r.nextInt(100);
        }
        return nums;
    }

    public long[] bubbleSort() {
        int comparisons = 0;
        int swaps = 0;
        /* // For random list generation
        longList = new long[length];
        for (int i=0; i<longList.length; i++) {
            longList[i] = r.nextLong(Long.MAX_VALUE);
        }
        */
        longList = new long[list.length];
        for (int i=0; i<longList.length; i++) {
            longList[i] = (long) list[i];
        }
        //System.out.println(Arrays.toString(longList));
        long temp;

        long start = System.currentTimeMillis();

        for (int i=1; i<longList.length-1; i++) {
            for (int j=0; j<longList.length-i; j++) {
                comparisons++;
                if (longList[j] > longList[j+1]) {
                    swaps++;
                    temp = longList[j];
                    longList[j] = longList[j+1];
                    longList[j+1] = temp;
                }
            }
        }

        long end = System.currentTimeMillis();

        System.out.println(Arrays.toString(longList));
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps + " | Time: " + (end - start));
        return longList;
    }

    public long[] radixSort() {
        /* // For random list generation
        long[] longList = new long[length];
        for (int i=0; i<longList.length; i++) {
            longList[i] = r.nextLong(Long.MAX_VALUE);
        }
        */
        longList = new long[list.length];
        for (int i=0; i<longList.length; i++) {
            longList[i] = list[i];
        }
        //System.out.println(Arrays.toString(longList));

        long start = System.currentTimeMillis();

        ArrayList[] buckets = new ArrayList[10];
        for (int i=0; i<buckets.length; i++) {
            buckets[i] = new ArrayList();
        }
        long[] longListCopy = longList;
        long maxNumber = 0;
        for (int i=0; i<longList.length; i++) {
            if (longList[i] > maxNumber)
                maxNumber = longList[i];
        }
        int maxPower = 0;
        while (maxNumber > 0) {
            maxNumber /= 10;
            maxPower++;
        }
        for (int n=0; n<maxPower; n++) {
            for (int i=0; i<longList.length; i++) {
                int digit = (int) (longList[i] / Math.pow(10, n)) % 10;
                buckets[digit].add(longList[i]);
            }
            int longListIndex = 0;
            for (int b=0; b<buckets.length; b++) {
                for (int e=0; e<buckets[b].size(); e++) {
                    longList[longListIndex] = (Long) buckets[b].get(e);
                    longListIndex++;
                }
            }
            for (int i=0; i<buckets.length; i++) {
                buckets[i] = new ArrayList();
            }
        }

        long end = System.currentTimeMillis();

        //System.out.println(Arrays.toString(longList));
        System.out.println("Time: " + (end - start));
        return longList;
    }
}

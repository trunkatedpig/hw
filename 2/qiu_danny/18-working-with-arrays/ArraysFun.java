import java.util.*;

public class ArraysFun {

    Random r = new Random();
    
    // Method used to print array nicely
    public void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
    }
    
    public int[] revFill(int n) {
        int[] revArray = new int[n];
        for (int i=0; i<n; i++) {
            revArray[i] = n-i;
        }
        return revArray;
    }

    public int[] makeRandom(int size, int min, int max) {
        int[] randomArray = new int[size];
        int diff = max - min - 1;
        for (int i=0; i<size; i++) {
            randomArray[i] = r.nextInt(diff) + min + 1;
        }
        return randomArray;
    }

    public int sum13(int[] nums) {
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 13)
                i++;
            else
                sum += nums[i];
        }
        return sum;
    }

    public boolean modThree(int[] nums) {
        int count = 0;
        boolean type = true; // true for even, false for odd
        for (int i=0; i<nums.length; i++) {
            if (((nums[i] % 2 == 0) && type) || ((nums[i] % 2 == 1) && !type))
                count ++;
            else {
                count = 1;
                type = !type;
            }
            if (count == 3)
                return true;
        }
        return false;
        /* // Above method is a lot more slick
        int count = 0;
        boolean type = true; // true for even, false for odd
        for (int i=0; i<nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (type)
                    count++;
                else {
                    count = 1;
                    type = true;
                }
            }
            else if (nums[i] % 2 == 1) {
                if (!type)
                    count++;
                else {
                    count = 1;
                    type = false;
                }
            }
            if (count == 3)
                return true;
        }
        return false;
        */
    }
}

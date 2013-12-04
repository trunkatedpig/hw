import java.io.*;
import java.util.*;

public class Array2 {

    	public int[] revfill (int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = n - i; }
        return a; }

 	public int[] MakeRandom(int size, int min, int max) {
	int[] a = new int[size];
	Random r = new Random();
	for (int i = 0; i < size; i++) {
	a[i] = (min + r.nextInt(max));}
	return a; }

public int sum13(int[] nums) {
int sum = 0;
int count = 0;
for (int i = 0; i < nums.length; i++) {
if (nums[i] != 13 && count == 0)
sum = sum + nums[i];
else {
if (count == 1)
count = 0;
else
count = 1;  } }
return sum;  
}

public boolean modThree(int[] nums) {
int count = 1;
for (int i = 1; i < nums.length; i++) {
if (count < 3) {
if ((nums[i] % 2) == (nums[i-1] % 2))
count = count + 1;
else
count = 1; }
if (count >= 3)
return true; }
return false; }




}

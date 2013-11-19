import java.util.*;

public class Arrays2 {
	public static int[] revFill(int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {result[i] = n - i;}
		
		return result;
	}
	
	public static int[] makeRandom(int length, int min, int max) {//excluding max
		int[] result = new int[length];
		Random random = new Random();
		
		for (int i = 0; i < length; i++) {result[i] = random.nextInt(max - min) + min;}
		
		return result;
	}
	
	public int sum13(int[] a) {//CodingBat
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 13) {
				if ((i + 1) < a.length) {i++;}
				continue;
			}
			
			sum += a[i];
		}
		
		return sum;
	}
	
	public boolean modThree(int[] a) {//CodingBat
		for (int i = 0; i < a.length - 2; i++) {
			if (((a[i] % 2 == 0) && (a[i + 1] % 2 == 0) && (a[i + 2] % 2 == 0)) || 
				((a[i] % 2 == 1) && (a[i + 1] % 2 == 1) && (a[i + 2] % 2 == 1))) {return true;}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(revFill(10)));
		System.out.println(Arrays.toString(makeRandom(10, 0, 11)));
	}
}

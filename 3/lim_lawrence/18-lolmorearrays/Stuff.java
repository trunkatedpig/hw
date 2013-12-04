import java.util.*;

public class Stuff {
    Random rng = new Random();

    public void printArray(int[] n) {
	System.out.print("{");
	for (int i=0;i<n.length;i++) {
	    System.out.print(n[i]);
	    if (i!=n.length-1)
		System.out.print(", ");
	}
	System.out.println("}");
    }
    public int[] RevFill(int n) {
	int[] r = new int[n];
	for (int i=0;i<n;i++) {
	    r[i]=n-i;
	}
	return r;
    }
    public int[] MakeRandom(int size, int min, int max) {
	int[] r = new int[size];
	if (min>max) {
	    System.out.print("go away  ");
	    return new int[] {};
	}
	for (int i=0;i<size;i++) {
	    r[i]=rng.nextInt(max-min+1)+min;
	}
	return r;
    }
    public int sum13(int[] nums) {
	int r = 0;
	int i = 0;
	while (i<nums.length) {
	    if (nums[i]==13)
		i=i+1;
	    else
		r=r+nums[i];
	    i=i+1;
	}
	return r;
    }
    public boolean modThree(int[] nums) {
	int evens=0;
	int odds=0;
	for (int i=0;i<nums.length;i++) {
	    if (nums[i]%2==0) {
		evens=evens+1;
		odds=0;
	    } else {
		odds=odds+1;
		evens=0;
	    }
	    if (evens==3 || odds==3) 
		return true;
	}
	return false; 
    }
}

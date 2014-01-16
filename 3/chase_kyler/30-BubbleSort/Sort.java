import java.util.*;
import java.io.*;

public class Sort {

	private int[] nums;
	private Random r = new Random(); 
	private int g;

	public Sort(){
	g = r.nextInt(25) + 1;
	nums = new int[g];
	for (int i = 0; i < g; i++)
		nums[i] = r.nextInt(10);
	}

	public String toString() {
		String s = "";
		for (int i = 0; i<g;i++)
			s = s + nums[i] + ", ";
		return s;
	}
	
	public void bSort(){
	boolean done = false; 
	int n = 0; 
	int i = 0;
	int s = 0;
	int c = 0;
	while (!done){
		done = true;
		for (i=0; i < g - 1; i++){
			c++;
			if (nums[i] > nums[i+1]){
				n = nums[i]; 
				nums[i] = nums[i+1]; 
				nums[i+1] = n; 
				done = false;
				s++;
			}
		}
	}
	System.out.println("Comparisons: " + c);
	System.out.println("Swaps: " + s);
	//return nums;
	}

	public void sSort() {
		int x, y;
		int s = 0;
		int c = 0;
		for (int i = 0; i < nums.length; i++) {
			x = nums[i]+1;
			y = 0;
			for (int j = i; j<nums.length; j++) {
				c++;
				if (nums[j] < x) {
					x = nums[j];
					y = j;
				}
			}
			nums[y] = nums[i];
			nums[i] = x;
			s++;
		}
			System.out.println("Comparisons: " + c);
			System.out.println("Swaps: " + s);
	}

	public void iSort() {
		int x, j;
		int c = 0;
		int s = 0;
		for (int i = 1; i < nums.length; i++) {
			x = nums[i];
			j = i;
			while (j > 0 && x < nums[j-1]) {
				c++;
				s++;
				nums[j] = nums[j-1];
				nums[j-1] = x;
				j--;
			}
			if (j > 0)
				c++;
		}
		System.out.println("Comparisons: " + c);
		System.out.println("Swaps: " + s);
	}









//this is not my code*****
/*
 private int Min = 0;
    private int Max = 10;
	private ArrayList[] buckets = new ArrayList[10];
    private int[] data = new int[10];
	
	
    public void fill() {
        Random r = new Random();
        for(int i=0;i<data.length;i++){
            data[i] = Min + (int)(Math.random() * ((Max - Min) + 1));
        }
    }

    public String sort() {
		System.out.println("Original array: " + Arrays.toString(data));
        for (int i=0;i<buckets.length;i++){
            buckets[i]=new ArrayList();
        }
        int place = 1;
		
        while (Max % place < Max) {
            for (int i=0;i<data.length;i++){
                buckets[(data[i]/place) % 10].add(data[i]);
			}
            place = place * 10;
			
			int i = 0;
			
			for (int j=0;j<buckets.length;j++){
				while (buckets[j].size() > 0){
					data[i] = (Integer)buckets[j].get(0);
					buckets[j].remove(0);
					i = i + 1;
				}
			}
			
        }
		System.out.println("Sorted array: " + Arrays.toString(data));
        return Arrays.toString(data);
    }
	*/
}
		
	
		
		

import java.util.*;

public class Radix {
    private int Min;
    private int Max;
	private ArrayList[] buckets = new ArrayList[10];
    private int[] data = new int[10];
	
	public Radix (int min, int max){
		Min = min;
		Max = max;
	}
	
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
    
    public int[] bsort(int[] a) {
	int compcount = 0;
	int swapcount = 0;
	for (int i=0;i<a.length;i++) {
	    for (int j=0;j<a.length-1;j++) {
		compcount ++;
		int left = a[j];
		int right = a[j+1];
		if (right > left) {
		    a[j] = right;
		    a[j+1] = left;
			swapcount ++;
		}
	    }
	}
	return a;
    }

}

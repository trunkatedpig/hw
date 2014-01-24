public class Sorts {

	// bubblesort 
	public int[] bsort(int[] a) {
		int numSwaps = 0;
		int numComparisons = 0;
		for (int k = 0; k < a.length; k++) {
			for (int i = 0; i < a.length - 1; i++) {
				numComparisons++;
				if (a[i] > a[i + 1]) {
					int tempSwapVar = a[i];
					a[i] = a[i + 1];
					a[i + 1] = tempSwapVar;
					numSwaps++;

				}
			}
		}	
		return a;
	}

	// insertion sort

	public int[] isort(int[] a) {
		int swaps = 0;
		int comparisons = 0;
		for(int i = 1; i < a.length; i++) {
			int j = i; 
			comparisons++;
			while ((j > 0) && (a[j - 1] > a[j])) {
				int tempVar = a[j - 1];
				a[j - 1] = a[j];
				a[j] = tempVar;
				swaps++;
				j = j - 1;
			}
		}
		return a;

	}

	// selection sort

	public int[] ssort(int[] a) {
		int comparisons = 0;
		int swaps = 0;
		for(int i = 0; i < a.length - 1; i++) {
			int currentMin = i; // by index
			for(int j = i + 1; j < a.length; j++) {
				if (a[j] < a[currentMin]) {
					currentMin = j;
				}
				comparisons++;
			}
			int tempVar = a[i];
			a[i] = a[currentMin];
			a[currentMin] = tempVar;
			swaps++;
		}
		return a;
	}


}
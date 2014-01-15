public class bubble {
    int swaps = 0;
    int comps = 0;
    int temp = 0;
    public int[] bsort(int[] a) {
	for (int i = 0; i < a.length - 1; i ++) {
	    for (int j = 0; j < a.length - 1; j ++) {
		if (a[j] > a[j + 1]) {
		    temp = a[j + 1];
		    a[j + 1] = a[j];
		    a[j] = temp;
		    swaps ++;
		}
		comps ++;
		if (swaps == 0) {
		    return a;
		}
	    }
	}
	return a;
    }
}

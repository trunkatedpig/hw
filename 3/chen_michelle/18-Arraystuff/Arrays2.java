public class Arrays2 {
    public int[] RevFill (int n) {
	int[] ar = new int[n];
	int i = 0;
	while (i<n-1) {
	    ar[i] = n - 1;
                 i ++;
	}
	return ar;
    }

    public int MakeRandom (int size, int min, int max) {
	int[] ar = new int[size];
	int o;
	while (size > 0) {

	    o = min + max * (Math.random() *( max - min + 1));
	    ar [size - 1] = o;

	}
	return ar;
    }
}

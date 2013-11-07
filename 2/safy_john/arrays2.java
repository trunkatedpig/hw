public class arrays2 {
    public int[] revfill(int n) {
	int[] intArray;
	intArray = new int[n];
	for (int i = 0; i < n; i ++) {
	    intArray[i] = n - i;
	}
	return intArray;
    }

    public int[] makeRandom(int n, int min, int max) {
	int[] intArray;
	intArray = new int[n];
	Random r = new Random(min, max);

	
}

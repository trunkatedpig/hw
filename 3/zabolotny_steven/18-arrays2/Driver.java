public class Driver {
    public static String aS(int[] array) {
	// Array to String converting method
	String retString = "" + array[0];
	for (int i = 1;i < array.length;i++) {
	    retString = retString + ", " + array[i];
	}
	return retString;
    }

    public static void main(String[] args) {
	Arrays a = new Arrays();
	System.out.println("RevFill 10: " + aS(a.Revfill(10)));
	System.out.println("\nMakeRandom 10, 5, 15: " + aS(a.makeRandom(10,5,15)));
	int[] Sample = {1,2,3,4,5,5,13};
	System.out.println("\nsum13 (should be 20): " + (a.Sum13(Sample)));
	System.out.println("\nmodthree (should be true): " + (a.modthree(Sample)));
        Sample[4] = 4;
	System.out.println("\nmodthree (should be false): " + (a.modthree(Sample)));
    }
}
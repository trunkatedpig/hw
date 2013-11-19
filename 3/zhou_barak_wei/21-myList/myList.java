public class myList {
	
	/* 
		Given an int array and a position, return a new array
		with the element at the position removed.
	*/

	public static int[] remove(int[]a, int pos) {
		if (pos > a.length-1 || pos < 0 ||a.length < 1) return a;
		int[] retArray = new int[a.length-1];
		for (int i=0; i<pos; i++)
			retArray[i] = a[i];
		for (int i=pos+1; i<a.length; i++)
			retArray[i-1] = a[i];
		return retArray;
	}
	
	/* 
		Given an int array, a position, and an integer, return
		an array with the integer added to the position and with
		the following elements pushed forward.
	*/
	
	public static int[] insert(int[] a, int pos, int d) {
		if (pos > a.length || pos < 0 || a.length < 1) return a;
		int[] retArray = new int[a.length+1];
		for (int i=0; i<pos; i++){
			retArray[i] = a[i];
		}
		for (int i=pos; i<a.length; i++) {
			retArray[i+1] = a[i];
		}
		retArray[pos] = d;
		return retArray;
	}
}
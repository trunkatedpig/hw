public class myList {
	public static int[] remove(int[]a, int pos) {
		if (pos > a.length-1 || a.length < 1) return a;
		int[] retArray = new int[a.length-1];
		for (int i=0; i<pos; i++)
			retArray[i] = a[i];
		for (int i=pos+1; i<a.length; i++)
			retArray[i-1] = a[i];
		return retArray;
	}
	
	public static int[] insert(int[] a, int pos, int d) {
		if (pos > a.length || a.length < 1) return a;
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
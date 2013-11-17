public class myList {	
	public static int remove(int pos) {
		int remove = a[pos];
		int[] retArray = new int[a.length-1];
		for (int i=0; i<pos; i++)
			retArray[i] = a[i];
		for (int i=pos; i<a.length; i++)
			retArray[i-1] = a[i];
		a = retArray;
		return remove;
	}
		
	public static void insert(int[] a, int pos, int d) {
		int[] retArray = new int[a.length+1];
		for (int i=0; i<pos; i++){
			retArray[i] = a[i];
		}
		retArray[pos] = d;
		for (int i=pos+1; i<a.length; i++) {
			retArray[i+1] = a[i];
		}
		a = retArray;
	}
}
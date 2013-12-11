public class arraystuff{
    public int[] Revfill(int n){
	int[] a = new int[n];
	for (int b = n;b > 0;b--){
	    a[a.length - b] = b;
	}
	return a;
    }
}
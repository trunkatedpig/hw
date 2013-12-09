public class 18-arraystuff{
    public int[] Revfill(int n){
	int[] a = new int[n];
	for (n;n > 0;n--){
	    a[a.length - n] = n;
	}
	return a;
    }
}
public class Driver{
    public static void main(String[] args){
	BubbleSort b = new BubbleSort();
	int[] a = new int[]{2,4,3,6,5,7,9};
	int[] n = b.bsort(a);
	System.out.println(b.toString(n));
    }
}

public class Driver{
    public static void main(String[] args){
		int[] test = {1,2,3,4,5,6,7,8,9,10};
		int[] dev = {9, 2, 5, 4, 12, 7, 8, 11, 9, 3, 7, 4, 12, 5, 4, 10, 9, 6, 9, 4};
		ArrayStuff a = new ArrayStuff();
		System.out.println(a.mean(test));
		System.out.println();
		System.out.println(a.stddev(dev));
    }
}
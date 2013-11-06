public class arrays {
   
public int[] middleWay(int[] a, int[] b) {
    int[] intArray;
    intArray = new int[2];
    intArray[0] = a[1];
    intArray[1] = b[1] ;
    return intArray;
}

public int[] makeEnds(int[] nums) {
    int[] intArray;
    intArray = new int[2];
    intArray[0] = nums[0];
    intArray[1] = nums[nums.length - 1];
    return intArray;
}

public int[] fizzArray(int n) {
    int[] intArray;
    intArray = new int[n];
    for(int i = 0;i < n;i++) {
	intArray[i] = i;}
    return intArray;
}

public boolean only14(int[] nums) {
   
int num = 0;
    num = nums.length;
    int onlyfourteen = 0;
    for(int i = 0;i != num;i++) {
	onlyfourteen = nums[i];
	if {onlyfourteen = 1 || onlyfourteen = 4) {
	    return true} else {
	    return false}}}
	


}

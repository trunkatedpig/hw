public class Driver {
    public static void main(String[] args) {
	Bubble bubble = new Bubble();
	int[] array = new int[15];
	for (int i = 0; i < array.length; i++){
	    array[i] = array.length-i;
	    System.out.print(array[i] + " ");
	}//
	bubble.bsort(array);
    }
}

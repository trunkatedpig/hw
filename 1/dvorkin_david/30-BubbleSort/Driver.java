public class Driver {
    public static void main(String[] args) {
	Bubble bubble = new Bubble();
	int[] array = new int[15];
	int[] extra = new int[15];
	for (int i = 0; i < array.length; i++){
	    array[i] = i;
	    // System.out.print(array[i] + " ");
	}
	array[2] = 3;
	array[3] = 2;

	for (int i = 0; i < array.length; i++){
	    System.out.print(array[i] + " ");
	}

	bubble.insertion(array);
	System.out.println ("\n=========");
	for (int i = 0; i < array.length; i++){
	    System.out.print(array[i] + " ");
	}
    }
}

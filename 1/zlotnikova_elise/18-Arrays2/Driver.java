public class Driver {
    public static void main(String[] args) { 
	ArrayStuff ar = new ArrayStuff();
	int[] array = ar.Revfill(5);
	/*	for (int i=0;i<array.length;i++) {
	    System.out.print(array[i]);
	    } */
	int[] array2 = ar.MakeRandom(5,1,10);
	/* for (int i=0;i<array2.length;i++) {
	    System.out.print(array2[i]);
	}
	*/
	int[] array3 = {1,2,3,4,13,14,2};
        System.out.println(ar.sum13(array3));
   }
}

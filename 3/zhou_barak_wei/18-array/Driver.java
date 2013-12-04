public class Driver {
    public static void main(String[] args) {
	System.out.println("#1");
	int[] test = array.RevFill(5);
	for(int i = 0; i<test.length; i++){
	    System.out.println(test[i]);
	}
	System.out.println("#2");
	int[] test2 = array.MakeRandom(5, 5, 10);
	for(int i = 0; i<test2.length; i++){
	    System.out.println(test2[i]);
	}
	System.out.println("#3");
	int[] test3 = {1, 2, 2, 1};
	System.out.println(array.sums13(test3));

	System.out.println("#4");
	int[] test4 = {2, 1, 3, 5};
	System.out.println(array.modThree(test4));
    }
}
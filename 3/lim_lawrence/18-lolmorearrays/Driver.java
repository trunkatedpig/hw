public class Driver {
    public static void main(String[] args) {
	Stuff s = new Stuff();
	System.out.println();
	s.printArray(s.RevFill(10));
	System.out.println();
	s.printArray(s.MakeRandom(10,3,5));
	s.printArray(s.MakeRandom(9001,1337,42)); //lolnope
	System.out.println();
	System.out.println(s.sum13(new int[] {13, 1, 2, 13, 2, 1, 13}));
	System.out.println();
	System.out.println(s.modThree(new int[] {9, 7, 2, 9, 2, 2}));
	System.out.println(s.modThree(new int[] {9, 7, 2, 9, 2, 2, 6}));
	System.out.println();
    }
}

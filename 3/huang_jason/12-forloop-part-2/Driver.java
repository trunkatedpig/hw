public class Driver{

    public static void main(String[] args){

	For2 f = new For2();

	System.out.println(f.diag(4));
	System.out.println(f.diag(6));

	System.out.println(f.diagWord("Hello"));
	System.out.println(f.diagWord("Goodbye"));

	System.out.println(f.fence(5,8));
	System.out.println(f.fence(9,9));
    }
}
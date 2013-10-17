public class Driver{

    public static void main(String[] args){
	For f = new For();
	
	System.out.println(f.fact(1));
	System.out.println(f.fact(12));
	
	System.out.println(f.reverse("Hello"));
	System.out.println(f.reverse("Goodbye"));

	System.out.println(f.table(5,3));
	System.out.println(f.table(7,7));
    }
}
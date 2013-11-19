
public class Driver {
    public static void main(String[] args){
	For l = new For();
	For l1 = new For();
	
	System.out.println("Testing ForLoops");
	System.out.println("factorial of 7 using for");
	System.out.println(l.fact(7));

	System.out.println("Testing Reverse");
	System.out.println("reverse 'Tyler Wang'");
	System.out.println(l1.Reverse("Tyler Wang"));

	System.out.println("Testing Table");
	System.out.println("table(5,3)");
	System.out.println(l.table(5,3));
    }
}

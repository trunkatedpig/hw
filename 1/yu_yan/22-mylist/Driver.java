public class Driver{
    public static void main(String[] args){
	myList a = new myList(5);
	System.out.println(a);
	System.out.println("Adding 70 at position 3");
	a.insert(3,70);
	System.out.println(a);
	System.out.println("Removing position 3");
	System.out.println(a.remove(3));
	System.out.println(a);
    }
}

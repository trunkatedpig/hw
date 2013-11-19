public class Driver{
    public static void main(String[] args){
	myList a = new myList();
	System.out.println(a);
	a.add(4);
	a.add(3, 7);
	System.out.println(a);
	System.out.println(a.get(2));
	System.out.println(a.size());
	a.set(2, 6);
	System.out.println(a);
	a.remove(2);
	System.out.println(a);
    }
}

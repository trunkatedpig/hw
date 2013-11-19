public class Driver {
    public static void main(String[] args) {
	myList L = new myList();

	L.add(3, 4);
	System.out.println(L);
	L.add(3, 5);
	System.out.println(L);

	L.remove(3);
	System.out.println(L);
	L.remove(3);
	System.out.println(L);

    }

}

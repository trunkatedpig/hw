public class Driver {
    public static void main(String[] args) {
        myList L = new myList();
	System.out.println("\nOriginal Array:");
        System.out.println(L);
	System.out.println("\nModified Array:");
        L.insert(3,1337);
        System.out.println(L+"\n");
	L.remove(3);
	System.out.println(L);

    }


}

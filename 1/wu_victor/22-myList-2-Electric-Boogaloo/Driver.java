public class Driver {
    public static void main(String[] args) {
	myList L = new myList();

	L.add(3, 4);
	System.out.println(L);
	L.add(3, 5);
	System.out.println(L);

	System.out.println(L.find(5));
	System.out.println(L.find(-7));

	L.fRemove(5);
	System.out.println(L);
	myListStrings M =new myListStrings();

	M.add(3, "hello");
	System.out.println(M);
	M.add(4,"hi");
	System.out.println(M);

	System.out.println(M.find("hello"));
	System.out.println(M.find("x'"));

	M.fRemove("hello");
	System.out.println(M);

    }

}

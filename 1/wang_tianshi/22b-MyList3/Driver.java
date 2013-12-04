public class Driver {
    public static void main(String[] args) {
        myList3 L = new myList3();
	myStringList L1 = new myStringList();
        
        for (int i=0;i<10;i++) {
            L.add(i*10);
        }
        System.out.println(L);

	System.out.println(L.find(20));
	System.out.println(L.find(70));

	L.fremove(30);
	System.out.println(L);

	//Testing myStringList
	System.out.println("testing myStringList");
        for (int i=0;i<10;i++) {
            L1.add(""+i*10);
        }
        System.out.println(L1);

        System.out.println("find 20");
	System.out.println(L1.find("20"));
        System.out.println("add 1001 at 3");
        L1.add(3,"1001");
        System.out.println(L1);
        System.out.println("remove pos 4");
	L1.remove(4);
	System.out.println(L1);
        System.out.println("fremove 60");
	L1.fremove("60");
        System.out.println(L1);

    }
}

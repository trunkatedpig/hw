public class Driver {
    public static void main(String[] args) {
        myList3 L = new myList3();
        
        for (int i=0;i<10;i++) {
            L.add(i*10);
        }
        System.out.println(L);

	System.out.println(L.find(20));
	System.out.println(L.find(70));

	L.fremove(30);
	System.out.println(L);

	System.out.println(L.convert());
    }
}
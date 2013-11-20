public class Driver {
    public static void main(String[] args) {
        myList L = new myList();

        for (int i=0;i<12;i++) {
            L.add(i*10);
        }
	System.out.println(L);
	L.insert(3,2);
	System.out.println(L);
    }
}

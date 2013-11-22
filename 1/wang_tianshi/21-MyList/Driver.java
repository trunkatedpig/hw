public class Driver {
    public static void main(String[] args) {
        myList L = new myList();
        
        for (int i=0;i<10;i++) {
            L.add(i*10);
        }
        System.out.println(L);

	L.insert(2,32);
        System.out.println(L);
	L.insert(4,3);
        System.out.println(L);
	L.insert(7,81);
        System.out.println(L);
	L.insert(1,10001);
        System.out.println(L);
	L.insert(0,6);
        System.out.println(L);
	L.insert(30,311);
        System.out.println(L);


    }
}

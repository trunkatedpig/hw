public class Driver {
    public static void main(String[] args) {
        myList L = new myList();

        System.out.println(L);
        for (int i = 0; i<5;i++) {
            L.add((i+1)*1);
        }
	
	L.insert(3,42);
        System.out.println(L);

        for (int i = 0; i<7;i++) {
            L.add((i+6)*1);
        }
        System.out.println(L);
	
	L.remove(6);
        System.out.println(L);
    }        


}

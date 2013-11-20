public class Driver {
    public static void main(String[] args) {
        myList L = new myList();
        
        for (int i=0;i<5;i++) {
            L.add(i*10);
        }
        System.out.println(L);

        for (int i=0;i<12;i++) {
            L.add(i*10);
        }

        System.out.println(L);

	/* System.out.println ("============================================");
    L.insert(4, 4);
    System.out.println(L);
    L.remove(4);
    System.out.println(L);
    System.out.println ("================================");
    System.out.println ( L.size());
    System.out.println ("================================");
    System.out.println (L.get(3));
    System.out.println ("================================");
    L.set(7, 2);*/
    System.out.println (L);
    System.out.println ("================================");
    System.out.println ( L.find(20));
    System.out.println ("================================");
    L.fremove(20);
    System.out.println (L);
    }

}

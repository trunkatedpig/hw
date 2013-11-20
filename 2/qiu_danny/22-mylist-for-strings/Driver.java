public class Driver {

    public static void main(String[] args) {
        myList L;
        if (args.length != 0) {
            L = new myList(Integer.parseInt(args[0]));
        }
        else {
            L = new myList();
        }
        System.out.println(L);
        for (int i = 0; i<5;i++) {
            L.add((i+1)*5);
        }
        System.out.println(L);

        for (int i = 0; i<7;i++) {
            L.add((i+1)*5);
        }

        System.out.println(L);
        L.add(1,666);
        System.out.println(L);
        L.add(3,666);
        System.out.println(L);
        L.add(5,666);
        System.out.println(L);
        L.add(7,666);
        System.out.println(L);
        L.remove(0);
        System.out.println(L);
        L.set(0, Integer.MAX_VALUE);
        System.out.println(L.get(0));
        System.out.println(L.size());
        L.remove(1000);
        System.out.println(L);

        L = new myList();
        System.out.println("\n" + L);
        System.out.println(L.find(5));
        L.fRemove(L.get(3));
        System.out.println(L);

        L = new myList(10, 100);
        System.out.println("\n" + L);
        L.fRemove(L.get(3));
        System.out.println(L);
    }
}

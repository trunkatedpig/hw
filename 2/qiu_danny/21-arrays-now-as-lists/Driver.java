public class Driver {

    public static void main(String[] args) {
        myList L;
        if (args.length != 0) {
            L = new myList(Integer.parseInt(args[0]));
        }
        else {
            L = new myList();
        }

        /*System.out.println(L);
        for (int i = 0; i<5;i++) {
            L.add((i+1)*5);
        }
        System.out.println(L);

        for (int i = 0; i<7;i++) {
            L.add((i+1)*5);
        }*/

        System.out.println(L);
        L.insert(1,666);
        System.out.println(L);
        L.insert(3,666);
        System.out.println(L);
        L.insert(5,666);
        System.out.println(L);
        L.insert(7,666);
        System.out.println(L);
    }
}

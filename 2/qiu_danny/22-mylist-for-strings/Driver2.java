public class Driver2 {

    public static void main(String[] args) {
        myStringList L;
        if (args.length != 0) {
            L = new myStringList(Integer.parseInt(args[0]));
        }
        else {
            L = new myStringList();
        }
        System.out.println(L);

        for(int i=1; i<11; i++){
            L.add(("s" + Integer.toString(i)));
        }
        System.out.println(L);
        L.add(1,"Testing String List");
        System.out.println(L);
        L.add("Testing End Input");
        System.out.println(L);
        L.remove(0);
        System.out.println(L);
        L.set(L.size() - 1, "The end should change by set");
        System.out.println(L);
        System.out.println(L.get(0));
        System.out.println(L.size());
        L.remove(1000);
        System.out.println(L);

        L = new myStringList();
        System.out.println();
        for(int i=1; i<11; i++){
            L.add(("s" + Integer.toString(i)));
        }
        System.out.println(L);
        System.out.println(L.find(L.get(0)));
        System.out.println(L.find("s4"));
        L.fRemove(L.get(3));
        System.out.println(L);
        L.fRemove("s4");
        System.out.println(L + " - Shows that nothing got removed when you input the string");
        
        L = new myStringList(3, true);
        System.out.println("\n" + L);
        L.fRemove(L.get(2));
        System.out.println(L);
    }
}

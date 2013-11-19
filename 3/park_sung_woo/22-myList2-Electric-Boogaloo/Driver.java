public class Driver{
    public static void main(String[] args){
        myList m = new myList();
        m.add(0);
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        m.add(5);
        System.out.println(m);
        m.add(2,13213123);
        System.out.println(m);
        m.add(2,1234);
        System.out.println(m);
        m.remove(0);
        System.out.println(m);
    }
}

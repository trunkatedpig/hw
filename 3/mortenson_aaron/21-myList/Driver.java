public class Driver {
    public static void main(String[] args) {
        myList L = new myList();

        System.out.println(L);
	L.add(3);
	L.add(5);
	L.add(1);
	L.add(4);
       	L.add(2,9);
	L.add(41);
	L.remove(1);
	L.add(1,12);
	System.out.println(L.set(0,17));
	System.out.println(L.get(6));
	System.out.println(L);
    }

}
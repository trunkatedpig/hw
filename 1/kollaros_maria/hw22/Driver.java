public class Driver{
    public static void main(String[] args){
	myList L = new myList();
	for(int i = 0; i < 10; i ++){
	    L.add(i * 10);
	}
	System.out.println(L);

	L.add(3,90);
	System.out.println(L);
	
	L.add(7,7);
	System.out.println(L);

	L.add(20,8);
	System.out.println(L);

	L.remove(5);
	System.out.println(L);

	System.out.println(L.size());
	System.out.println(L.get(9));
	System.out.println(L.get(1));

	L.set(2,14);
	System.out.println(L);

	System.out.println(L.find(10));
	L.fremove(10);
	System.out.println(L);
    }
}

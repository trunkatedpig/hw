public class DriverList {
    public static void main(String[] args) {
	myStringList L = new myStringList();
	
	for (int i=0;i<15;i++) {
	    L.add("Hello" + i);
	}
	System.out.println(L);
	L.remove(2);
	System.out.println(L);
	System.out.println(L.get(1));
	L.set(3 ,"bob");
	System.out.println(L);
	System.out.println(L.size());

	for (int i = 0; i < 14; i++)
	    L.insert(2,"hello");
	System.out.println(L);
	L.fremove("Hello12");
	L.find("Hello7");
	System.out.println(L);
    }


}

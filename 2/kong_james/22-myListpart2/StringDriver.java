public class StringDriver{
    public static void main(String[] args){
	myStringList L = new myStringList();
	L.add("Hello");
	L.add("James");
	System.out.println(L);
	System.out.println("Is full?" + L.isFull());
	L.add("BubbleGum");
	System.out.println(L);
	L.add(3,"Food");
	System.out.println(L);
	L.remove(0);
	System.out.println(L);
	System.out.println(L.find("James"));
	L.fremove("James");
	System.out.println(L);
    }
}

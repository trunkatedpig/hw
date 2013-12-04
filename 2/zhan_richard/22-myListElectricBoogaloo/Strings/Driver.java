public class Driver{
    public static void main(String[] args){
	myListStrings L = new myListStrings();
	L.add("Hello");
	L.add("James");
	L.add("Mr Sandman");
	L.add("Sir Gallahad");
	L.add("other stuff");
	L.add("list expansion");
	System.out.println(L);
	L.add(2,"OBJECTION");
	System.out.println(L);
	L.remove(4);
	System.out.println(L);
	System.out.println(L.size());
	System.out.println(L.get(1));
	L.set(0,"Yes?");
	System.out.println(L);
	System.out.println(L.find("other stuff"));
	L.fremove("list expansion");
	System.out.println(L);
    }
}

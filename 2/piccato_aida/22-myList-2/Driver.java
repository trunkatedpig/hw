public class Driver {
    public static void main(String[] args) {
	myStringList s = new myStringList();
	System.out.println(s);
	s.grow();
	System.out.println(s);
	s.add("B");
	System.out.println(s);
	s.add(3,"C");
	System.out.println(s);
	s.remove(3);
	System.out.println(s);
	System.out.println(s.find("B"));




	
	
    }
}

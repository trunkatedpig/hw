public class Driver{
    public static void main(String[] args){
	MyList a = new MyList();
	System.out.println(a);
	System.out.println(a.find(2));
	a.fRemove(2);
	System.out.println(a);
	
	MyStringList s = new MyStringList();
	System.out.println(s);
	s.fRemove("a");
	System.out.println(s);
    }
}

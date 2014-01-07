public class Driver {
    public static void main(String[] args) {
	Cypher a = new Cypher ();
	System.out.println (a.encode ("hello", 3));	
	System.out.println(a.encode("abcxyz",3));
    }
            
}

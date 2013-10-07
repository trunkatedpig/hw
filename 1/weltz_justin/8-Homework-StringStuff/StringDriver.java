public class StringDriver {
    public static void main (String[] args) {
	StringStuff s1;
	String name,name2;
	name = "justin weltz";
	name2 = "James Bond";
	s1 = new StringStuff();
	System.out.println(s1.capitalize(name));
	System.out.println(s1.bondify(name2));
    }
}

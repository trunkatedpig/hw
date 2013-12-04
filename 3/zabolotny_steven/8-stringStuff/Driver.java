public class Driver {
    public static void main(String[] args) {
	StringStuff s = new StringStuff();
	System.out.println(s.capitalize("steven zabolotny"));
	System.out.println(s.bondify("Steven Zabolotny"));
	System.out.println(s.PigLatinify("Steven"          ));
	System.out.println(s.PigLatinify("Strng"));
    }
}
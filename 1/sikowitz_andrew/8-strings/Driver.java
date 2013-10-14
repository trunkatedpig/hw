public class Driver {
    public static void main(String[] args) {
	StringStuff s = new StringStuff();

	System.out.println(s.capitalize("andrew sikowitz"));
	System.out.println(s.bondify("james bond"));
	System.out.println(s.pigLatinify("happy"));
	System.out.println(s.pigLatinify("ground"));
	System.out.println(s.pigLatinify("block"));
	System.out.println(s.pigLatinify("then"));
	System.out.println(s.pigLatinify("egg"));
    }
}

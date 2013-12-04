public class Driver {
	public static void main(String[] args) {
		StringStuff StringStuff = new StringStuff();
		System.out.println("capitalize(\"sean yip\") -> " + StringStuff.capitalize("sean yip"));
		System.out.println("bondify(\"sean yip\" -> " + StringStuff.bondify("sean yip"));
		System.out.println("pigLatinify(\"word\") -> " + StringStuff.pigLatinify("word"));
		System.out.println("pigLatinify(\"apple\") -> " + StringStuff.pigLatinify("apple"));
	}
}

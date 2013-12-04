public class Driver {
	public static void main(String[] args) {
		System.out.println(StringStuff.capitalize("barak zhou"));
		System.out.println(StringStuff.capitalize("mike zamansky"));
		
		System.out.println(StringStuff.bondify("Barak Zhou"));
		System.out.println(StringStuff.bondify("Mike Zamansky"));
		
		System.out.println(StringStuff.PigLatinify("happy"));
		System.out.println(StringStuff.PigLatinify("egg"));
		System.out.println(StringStuff.PigLatinify("Happy"));
		System.out.println(StringStuff.PigLatinify("Egg"));
		System.out.println(StringStuff.PigLatinify(""));
	}
}
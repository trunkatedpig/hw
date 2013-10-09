public class StringDriver{
    public static void main(String[] args){
	StringStuff s = new StringStuff();
	/*System.out.println(s.bondify("Sarah Prutchenko"));
	System.out.println(s.capitalize("sarah prutchenko"));
	*/
	System.out.println("Testing consenants");
	System.out.println(s.pigLatinify("hello"));
	System.out.println(s.pigLatinify("laura"));
	System.out.println("Testing all of the vowel cases");
	System.out.println(s.pigLatinify("apple"));
	System.out.println(s.pigLatinify("egg"));
	System.out.println(s.pigLatinify("iguana"));
	System.out.println(s.pigLatinify("umbrella"));
	System.out.println(s.pigLatinify("ostrich"));
	System.out.println(s.pigLatinify("yak"));
    }
}

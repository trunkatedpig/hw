public class Driver{
    public static void main(String[] args){
	StringStuff s;
	s = new StringStuff();
	System.out.println(s.capitalize("richard zhan"));
	System.out.println(s.bondify("richard zhan"));
	piglatin s0;
	s0 =new piglatin();
	System.out.println(s0.piglatinify("piano"));
	System.out.println(s0.piglatinify("Piano"));
	System.out.println(s0.piglatinify("apple"));
	System.out.println(s0.piglatinify("Apple"));
	System.out.println(s0.piglatinify("Character"));
	System.out.println(s0.piglatinify("Sh"));
    }
}

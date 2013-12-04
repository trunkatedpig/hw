public class Driver{
    public static void main(String[] args){
	StringStuff s;
	String result, otherResult, pigResult, pigResult2;
	s = new StringStuff();
	result = s.capitalize("shane lorenzen");
	otherResult = s.bondify("shane lorenzen");
	pigResult = s.pigLatinify("antagonist");
	pigResult2 = s.pigLatinify("pirate");
	System.out.println(result);
	System.out.println(otherResult);
	System.out.println(pigResult);
	System.out.println(pigResult2);
    }
}

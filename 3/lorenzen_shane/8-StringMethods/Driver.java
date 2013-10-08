public class Driver{
    public static void main(String[] args){
	StringStuff s;
	String result, otherResult;
	s = new StringStuff();
	result = s.capitalize("shane lorenzen");
	otherResult = s.bondify("shane lorenzen");
	System.out.println(result);
	System.out.println(otherResult);
    }
}

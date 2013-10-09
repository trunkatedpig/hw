public class Driver {

    public static void main(String [] args){
	StringStuff test1;
	test1= new StringStuff();
	System.out.println(test1.capitalize("edison shi"));
	System.out.println(test1.capitalize("angela lin"));
	System.out.println(test1.bondify("angela lin"));
	System.out.println(test1.pigLatinify("angela lin"));
	System.out.println(test1.pigLatinify("flying monkey"));

    }
}

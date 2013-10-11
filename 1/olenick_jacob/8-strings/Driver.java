public class Driver {

    public static void main(String[] args){
	stringStuff x = new stringStuff();
	System.out.println(x.capitalize("john smith"));
	System.out.println(x.bondify("john smith"));
	System.out.println(x.pigLatinify("Jake"));
	System.out.println(x.pigLatinify("Anjelika"));
	System.out.println(x.pigLatinify("Thermal"));
	System.out.println(x.pigLatinify("character"));
    }
}
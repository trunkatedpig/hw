public class StringStuff{

    private String firstname;
    private String lastname;
    private String firstletterfn;
    private String firstletterln;

    /* indexOf(String s)
          Returns the index within this String of the first occurrence of s.

       substring(int firstIndex, int lastIndex)
          Returns a new String consisting of the characters with indexes in the range [from..to) from this String object.
 
       x = x.toUpperCase();             // convert to upper case
          if ("HELLO".equals(x)) {          
              System.out.println("yes 2");
          }
    */
    
    public StringStuff(){
	firstname = "Jason";
	lastname = "Huang";
	firstletterfn = "J";
        firstletterln = "H";
    }

    public StringStuff(String name){
	firstname = name.substring(0,name.indexOf(" "));
	lastname = name.substring(name.indexOf(" ") + 1);
	firstletterfn = firstname.substring(0,1);
	firstletterln = lastname.substring(0,1);
    }
    
    public String capitalize(String name){
	String capfirst, caplast;
	capfirst = firstname.replaceFirst(firstletterfn,firstletterfn.toUpperCase());
	caplast = lastname.replaceFirst(firstletterln,firstletterln.toUpperCase());
	return capfirst + " " + caplast;
    }

    public String bondify(String name){
	String capfirst, caplast;
	capfirst = firstname.replaceFirst(firstletterfn,firstletterfn.toUpperCase());
	caplast = lastname.replaceFirst(firstletterln,firstletterln.toUpperCase());
	return caplast + ", " + capfirst + " " + caplast;
    }
 
    public String piglatinify (String name){
	String firstletter, rest;
	firstletter = name.substring(0,1);
	rest = name.substring(1);
	if (firstletter.equals("a") ||
            firstletter.equals("e") ||
            firstletter.equals("i") ||
            firstletter.equals("o") ||
            firstletter.equals("u") ||
            firstletter.equals("y")){
	    return (name + "hay");
	}
	else{
	    return (rest + firstletter + "ay");
	}
    }
}
public class StringStuff {
    public String capFirst(String s) {
	//capitalize first letter of string
	return s.substring(0,1).toUpperCase() + s.substring(1);
    }
    public String capitalize(String name) {
	//capitalize a lowercase two word string
	String f=name.substring(0,name.indexOf(" "));
	String l=name.substring(name.indexOf(" ")+1);
	return capFirst(f)+" "+capFirst(l);
    }
    public String bondify(String name) {
	//bondifies a lowercase two word string
	String f=name.substring(0,name.indexOf(" "));
	String l=name.substring(name.indexOf(" ")+1);
	return capFirst(l)+", "+capFirst(f)+" "+capFirst(l);
    }
}

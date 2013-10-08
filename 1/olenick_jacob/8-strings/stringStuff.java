public class stringStuff {

    public String capitalize(String name) {
	String c = "" + name.charAt(0);
	name = c.toUpperCase() + name.substring(1,name.indexOf(" "))+" "+name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2).toUpperCase() + name.substring(name.indexOf(" ")+2);
	return name;
    }

    public String bondify(String name){
	String first = name.substring(0,name.indexOf(" "));
	String last = name.substring(name.indexOf(" ")+1);
	return last + ", " + first + " " + last;
    }
}
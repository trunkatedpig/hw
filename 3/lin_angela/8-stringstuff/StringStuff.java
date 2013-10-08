public class StringStuff {

    public String capitalize(String name){
	String firstInitial, lastInitial;
	firstInitial =name.substring(0,1);
	String firstI= firstInitial.toUpperCase();
	lastInitial = name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2);
	String lastI = lastInitial.toUpperCase();
	String returnName = firstI + name.substring(1,name.indexOf(" ")+1) + lastI + name.substring(name.indexOf(" ")+2);
	return returnName;
    }


    public String bondify(String name){
	String lastInitial = name.substring(name.indexOf(" ")+1, name.indexOf(" ")+2);
	String lastI = lastInitial.toUpperCase();
	String lastName = lastI + name.substring(name.indexOf(" ")+2);
	String bondifiedName = lastName + ", " + capitalize(name);
	return bondifiedName;
    }


}

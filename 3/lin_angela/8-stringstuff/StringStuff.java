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

    public String pigLatinify(String name){
	String pigifiedN;
	int space = name.indexOf(" ");
	String firstI=name.substring(0,1);
	String firstName =name.substring(0,space);
	String lastI = name.substring(space+1, space+2);
	String lastName = name.substring(space+1);
	    if (firstI.equals("A") || firstI.equals("E") || firstI.equals("I") || firstI.equals("O") || firstI.equals("U")) {
		pigifiedN= firstName + "ay" + " " + lastName + "ay";
	    } else {
		pigifiedN = name.substring(1,space) + firstI + "ay" + " " + name.substring(space+2) + lastI + "ay";
	    }
	    return pigifiedN;



    }

}

public class StringStuff {
    
    public String capitalize(String name) {
	/*first = name.split(" ")[0];
	last = name.split(" ")[1];

	firstLetter = first.subString(0,1).toUpperCase();
	secondLetter = second.subString(0,1).toUpperCase();
	first = first.subString(1);
	second = second.subString(1);

	return firstLetter + first + " " + secondLetter + second;*/

	int index = name.indexOf(" ");
	String first = name.substring(0,1).toUpperCase() + name.substring(1, index);
	String last = name.substring(index+1, index+2).toUpperCase() + name.substring(index+2);

	return first + " " + last;
    }

    public String bondify(String name) {
	if (name.equals(name.toLowerCase()))
	    name = capitalize(name);

	String first = name.split(" ")[0];
	String last  = name.split(" ")[1];

	return last + ", " + first + " " + last;
    }
}

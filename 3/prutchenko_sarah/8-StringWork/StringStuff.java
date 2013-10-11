public class StringStuff{
    /* public String bondify(String bName){
	String[] split = bName.split(" ");
	String last = split[1];
	return last + " , " + bName;
	}
    public String capitalize(String cName){
	int pos = cName.indexOf(" ");
	String first = cName.substring(0, 1).toUpperCase();
	String firstname = cName.substring(1, pos+1);
	String last = cName.substring(pos+1, pos+2).toUpperCase();
	String lastname = cName.substring(pos+2);
	return first + firstname + last + lastname;
	}*/

    public String pigLatinify( String word){
	String fletter = word.substring(0, 1);
	if ("a".equals (fletter)){
		return word + "yay";
	    } 
	if ("e".equals (fletter)){
		return word + "yay";
	    }
	if ("i".equals (fletter)){
		return word + "yay";
	    }
	if ("o".equals (fletter)){ 
		return word + "yay";
	    }
	if ("u".equals (fletter)){
		return word + "yay";
	    }
	if ("y".equals (fletter)){
		return word + "yay";
	    }
	else {
	    return word.substring(1) + fletter + "ay";
	}
    }
}

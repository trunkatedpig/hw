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
    public boolean isVowel(String l){
	return (l.equals("A")||l.equals("a")||
		l.equals("E")||l.equals("e")||
		l.equals("I")||l.equals("i")||
		l.equals("O")||l.equals("o")||
		l.equals("U")||l.equals("u")||
		l.equals("Y")||l.equals("y"));
    }
    public String piglatinify(String word) {
	//piglatinifies a single word
	if (word.indexOf(" ")==-1) {
	    if (isVowel(word.substring(0,1))) {
		return word+"ay";
	    } else {
		return piglatinify(word.substring(1)+word.substring(0,1));
	    }
	} else {
	    return (piglatinify(word.substring(0,word.indexOf(" ")))+" "+
		    piglatinify(word.substring(word.indexOf(" ")+1)));
	}
    }
}

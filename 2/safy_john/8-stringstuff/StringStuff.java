//I'm getting a "not a statement" error when I compile this on lines 4 & 7; I'm not sure why.
public class StringStuff{
   
    public String first(String name){
        name.substring(0,1).toUpperCase() + name.split(" ")[0].substring(1);
    }
    public String last(String name){
        name.split(" ")[1].substring(0,1).toUppercase() + name.split(" ")[1].substring(1);
    }
    public String capitalize(String name){
	return first + " " + last;
    }
    public String bondify(String name){
	return last + ", " + first + " "  + last;
    }
    //John Safy and Sam Kim
    public String pigLatinify(String word){
	int length = word.length();
	if ((word.substring(0,1).equals("a")) 
	    ||
	    (word.substring(0,1).equals("e"))
	    ||
	    (word.substring(0,1).equals("i"))
       	    ||
	    (word.substring(0,1).equals("o"))
	    ||
	    (word.substring(0,1).equals("u"))) {
	    return word + "ay"; }
	else return word.substring(1,length) + word.substring(0,1) + "ay";
    }
}

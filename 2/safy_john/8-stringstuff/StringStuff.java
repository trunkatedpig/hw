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
    public String PigLatinify(String word){
	if (word.substring == a, e, i, o, u) {
	    return word + "yay";}
	 else {
	    return word.substring(1) + word.substring(0,1) + "ay";
	    //whatdoidosomanyerrors:(
	}}
}

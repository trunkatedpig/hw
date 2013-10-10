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

    public String pigLatinify(String word){
	char a = word.charAt(word.length()-1);
	char c = word.charAt(0);
	String d = word.substring(0,2);
	if (c=='a'|c=='e'|c=='i'|c=='o'|c=='u'|c=='A'|c=='E'|c=='I'|c=='O'|c=='U') { 
	    if ((a=='a'|a=='e'|a=='i'|a=='o'|a=='u')){
		word = word + "yay";
	    }
	    else {
		word = word + "ay";
	    }
	}
	else if (d.equals("th")|d.equals("ch")|d.equals("sh")|d.equals("Th")|d.equals("Ch")|d.equals("Sh")){
	    word = word.substring(2) + d + "ay";
	}
	else {
       	    word = word.substring(1) + c + "ay";
	}
	return word;
    }
}
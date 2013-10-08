import java.io.*;
import java.util.*;

public class StringStuff{
    private String a,b,c,d,e,f,word,fLetter,rest;
    private int i;

    public String capitalize(String n){
	a=n.substring(0,1);
	i=n.indexOf(" ");
	b=a.toUpperCase();
	c=b+n.substring(1,i+1);
	d=n.substring(i+1,i+2).toUpperCase();
	e=d+n.substring(i+2);
	f=c +e;
	return f;
	
    }
    public String bondify(String n){
	a=capitalize(n);
	i=n.indexOf(" ");
	b=a.substring(i+1);
	c=b + ", " + a;
	return c;
    }
    public String PigLatinify(String w){
	fLetter=w.substring(0,1);
	if (fLetter.equals("a") ||
	    fLetter.equals("e") ||
	    fLetter.equals("i") ||
	    fLetter.equals("o") ||
	    fLetter.equals("u") ||
	    fLetter.equals("A") ||
	    fLetter.equals("E") ||
	    fLetter.equals("I") ||
	    fLetter.equals("O") ||
	    fLetter.equals("U")){
	    word=w+"ay";
	}
	else {
	    rest=w.substring(1);
	    word=rest+fLetter+"ay";
	}
	return word;
    }

}
/*PigLatinify would have been easier using lists, like in python if string in list _ */

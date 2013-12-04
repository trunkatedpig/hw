import java.io.*;
import java.util.*;

public class StringStuff{
    //Variables
    private  String firstCap, secondCap, firstEnd, secondEnd, firstLetter;

    //Methods
    public String capitalize(String name){
	int space = name.indexOf(" ");
	firstCap = name.substring(0,1);
	secondCap = name.substring((space + 1), (space + 2));
	firstEnd = name.substring(1, space);
	secondEnd = name.substring(space + 2);
	return firstCap.toUpperCase() + firstEnd + " " + secondCap.toUpperCase() + secondEnd;
    }

    public String bondify(String name){
	String fullName, lastName;
	fullName = name;
	int space = name.indexOf(" ");
	lastName = name.substring((space + 1));
	return lastName + ", " + fullName;
    } 

    public String PigLatinify(String word){
	firstLetter = word.substring(0,1);
	String word1;

	if (firstLetter.equals("a") || firstLetter.equals("e") ||firstLetter.equals("i") ||firstLetter.equals("o") || firstLetter.equals( "u")){
	    word1 = word + "yay";
	}
	else { 
	    word1 =  word.substring(1) + firstLetter + "ay";
	}
	return   word1;
	    } 
     
}

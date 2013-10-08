import java.io.*;
import java.util.*;

public class StringStuff{

    String FirstLetter;
    int LastLetterIndex;
    String LastLetter;
    int nameLength;
    String capitalFLetter;
    String capitalLLetter;
    
    
    String capitalize(String name){
	nameLength = name.length();
	FirstLetter = name.substring(0,1);
	LastLetterIndex = name.indexOf(" ") + 1;
	LastLetter = name.substring(LastLetterIndex,LastLetterIndex+1);
	
	capitalLLetter = LastLetter.toUpperCase();
	capitalFLetter = FirstLetter.toUpperCase();

	name = name.replace(FirstLetter,capitalFLetter);
	name = name.replace(LastLetter,capitalLLetter);
	
	/*
		System.out.println(LastLetter);
	
	System.out.println(FirstLetter);
	System.out.println(LastLetterIndex);
	
	System.out.println(name);
	*/
        return name;
    }
  
    String FirstName;
    String LastName;
    String returnString;
    int spaceIndex;
    
    
    String bondify(String name){
	
	spaceIndex = name.indexOf(" ") + 1;
	FirstName = name.substring(0,spaceIndex);
	LastName = name.replace(FirstName,"");
	
	System.out.println(FirstName);
	System.out.println(spaceIndex);
	System.out.println(LastName);
	
	returnString = LastName + "," + FirstName + LastName;
	return returnString;
    }
    
    
}	




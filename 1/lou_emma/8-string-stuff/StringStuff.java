import java.io.*;
import java.util.*;

public class StringStuff{
	
	private String name;
	private int holder;
	
	public StringStuff(){
	}
	
	
	public void indexHolder(String name){
		holder=name.indexOf (" ");
	}
	
	public String capitalize (String name){
		int len=name.length();
		String firstLetter=name.substring(0,1); 
		String upperFirst=firstLetter.toUpperCase();//capitalizes first letter of first word
		String firstRest=name.substring(1,holder);//rest of the word excluding the first char
		String lastLetter=name.substring(holder+1,holder+2); 
		String upperLast=lastLetter.toUpperCase();//capitalizes first letter of second word
		String lastRest=name.substring(holder+2, len); //rest of the second word excluding first char
		
		String properCapitalization=upperFirst+firstRest+" "+upperLast+lastRest;
		
		return properCapitalization;
		
	}
	
	public String bondify (String name){
		int len=name.length();
		String newName=capitalize(name);
		//String firstName=newName.substring(0,holder); NOT NEEDED
		String lastName=newName.substring(holder+1,len);
		
		String bonding=lastName+", "+newName;
		
		return bonding;
	}
}
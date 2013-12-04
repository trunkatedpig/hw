import java.io.*;
import java.util.*;

public class PigLatin{
    String finalWord = "";
 


    public void PigLatinifyVOWEL(String word){
	String newWord = ""; 
	String CapitalWord = word.toUpperCase();
	String firstLetter = CapitalWord.substring(0,1);
	if (firstLetter.equals("E")  || firstLetter.equals("A") || firstLetter.equals("I") ||  firstLetter.equals("O") || firstLetter.equals("U")){
	    newWord = word +"-" +  "ay";

	    
	    finalWord = newWord;
	    /*
	    System.out.println(firstLetter);
	    System.out.println(finalWord);
	    System.out.println("1");
	    */
	    
	    
	}
	else {
	    PigLatinifyCONS(word);
	    
	    /*
	    System.out.println(firstLetter);
	    System.out.println(finalWord);
	    System.out.println("21");
	    */
	    
	}

    }
	
    public void PigLatinifyCONS(String word){
	String firstLetter = word.substring(0,1);
	String restOfWord = word.substring(1);
	String newWord = "";
	
	newWord = restOfWord + "-" + firstLetter + "ay";
	finalWord = newWord;}
    
    public String PigLatinify(String word){
	PigLatinifyVOWEL(word);
	return finalWord;
    }
}
	

	    

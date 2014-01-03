import java.io.*;
import java.util.*;

public class Cipher{
    public static void main(String[] args){

	System.out.println((char) ('a' + 3));

	if (args.length != 0){
	Cipher c = new Cipher(args[0]);
	}
	else 
	    System.out.println("No String given");
    }
    
    public Cipher(String input){
	//input = deCap(input);
	String firstWord = getFirstWord(input);
	String output = "";
	System.out.println(Encrypt(input, 2));
	
    }   

    public String getFirstWord(String input){
	String firstWord = "";
	
	if (input.contains(" ")){
	    for (int i = 0; input.charAt(i) != ' '; i++){
		firstWord += input.charAt(i);
		}
	    System.out.println(firstWord); //for testing
	}
	else{
	    for (int i = 0; i < input.length(); i ++){
		firstWord += input.charAt(i);
	    }
	    System.out.println(firstWord); //for testing
	}
	return firstWord;
    }

    public String Encrypt(String input, int num){
      	String output = "";
      	
	for(int i = 0; i < input.length(); i++){
	    if (input.charAt(i) + num > 'z' && input.charAt(i) >= 97 && input.charAt(i) <= 122){
		output += ((char) (input.charAt(i) + (num - 26)));
	    }
	    else if(input.charAt(i) + num <= 'z' && input.charAt(i) >= 97 && input.charAt(i) <= 122){
		output += ((char) (input.charAt(i) + num));
	    }
	    else
		output += input.charAt(i);
	}
      	return output;
    } 
    
    public String Decrypt(String input){
	String output = "";

	return output;
    }
    

}
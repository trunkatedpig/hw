import java.io.*;
import java.util.*;

public class Cipher{
    public static void main(String[] args){
	try{
	    Cipher C = new Cipher(args[0]);
	}catch(Exception e){
	    System.out.println(e + "\nNo String to decipher.");
	}
    }

    public Cipher(){
	System.out.println("Gimme a String!");
    }
    
    public Cipher(String input){
	//input = deCap(input);
	
	String output = "";
	String firstWord = "";
	

	for (int i = 0; input.charAt(i) != ' '; i++){
	    firstWord += input.charAt(i);
	}
	System.out.println(firstWord);


	for (int j = 0; j < 26; j++){
	    for (int k= 0; k < input.length(); k++){
		
	    }
	}
    }   

    public String Encrypt(String input, String num){
	String output = "";
	for(int i = 0; i < input.length(); i++){
	    if (input.charAt(i) + num <= 'z'){
		output += input.charAt(i) + num;
	}
	    else{
		output += input.charAt(i) - (26+num);
	    }
	}
	return output;
    }
}
import java.io.*;
import java.util.*;

public class Cipher{
    
    public ArrayList<String> wordList;

    public static void main(String[] args){

	if (args.length > 1){
	    Cipher c = new Cipher(args[0], Integer.parseInt( args[1]));
	}
	else
	    System.out.println("No String given");
    }
    
    public Cipher(String input, int num){
       	//input = deCap(input);
	String firstWord = getFirstWord(input);
	String output = "";
	readWords("words.txt");
	System.out.println(Encrypt(input, num));
	System.out.println(Decrypt(input));
    }   

    public String getFirstWord(String input){
	String firstWord = "";
	
	if (input.contains(" ")){
	    for (int i = 0; input.charAt(i) != ' '; i++){
		firstWord += input.charAt(i);
		}
	}
	else{
	    for (int i = 0; i < input.length(); i ++){
		firstWord += input.charAt(i);
	    }
	}
	return firstWord;
    }

    private void readWords(String filename){	
	int longest = 0;

	wordList = new ArrayList<String>();
	try{
	    Scanner sc = new Scanner(new File(filename));
	    while(sc.hasNext()){
		String s = sc.nextLine();
		wordList.add(s);
		if (s.length() > longest)
		    longest = s.length();
	    }
	}catch (Exception e) {
	    System.out.println(e);
	    System.exit(0);
	}
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
	String firstWord = getFirstWord(input);
	String output = "";
	
	for (int a = 1; a < 26; a++){
	    if (wordList.contains(Encrypt(firstWord, a))){
		return (Encrypt(firstWord, a));
	    }
	}
	return "ERROR";
    }
    

}
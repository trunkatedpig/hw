import java.io.*;
import java.util.*;

public class Stringstuff {

    public String name, word;

    public String capitalize(String name){
	String s1 = name.substring(0,1);
	String value1 = s1.toUpperCase();
	int i = name.indexOf(" ");
	String value2 = name.substring(1,i);
	int l = name.length();
	String s3 = name.substring(i+1, i+2);
	String value3 = s3.toUpperCase();
	String value4 = name.substring(i+2);
	String answer = value1 + value2 + " " + value3 + value4;
	return answer;
    }

    public String bondify(String name){
	String s1 = name.substring(0,1);
	String value1 = s1.toUpperCase();
	int i = name.indexOf(" ");
	String value2 = name.substring(1,i);
	int l = name.length();
	String s3 = name.substring(i+1, i+2);
	String value3 = s3.toUpperCase();
	String value4 = name.substring(i+2);
	String answer = value3 + value4 + ", " + value1 + value2 + " " + value3 + value4;
	return answer;
    }
    
    public String piglatinify(String word){
	String firstletter = word.substring(0,1);
	String firsttwoletters = word.substring(0,2);
	String result;
	if (firsttwoletters.equalsIgnoreCase("ch") || firsttwoletters.equalsIgnoreCase("sh") || firsttwoletters.equalsIgnoreCase("th") || firsttwoletters.equalsIgnoreCase("ph")){
	String s1 = word.substring(2);
	String s2 = word.substring(0,2);
	result = s1 + s2 + "ay";
    }
    if (firstletter.equalsIgnoreCase("a") || firstletter.equalsIgnoreCase("e") || firstletter.equalsIgnoreCase("i") || firstletter.equalsIgnoreCase("o") || firstletter.equalsIgnoreCase("u")) {
	result = word + "ay";
    }
    else {
	result = word.substring(1) + firstletter + "ay";
    }
    return result.toLowerCase();
}
}

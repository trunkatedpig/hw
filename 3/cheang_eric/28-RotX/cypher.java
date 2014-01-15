import java.io.*;
import java.util.*;

public class cypher{
    
    private boolean isLetter(char character) {
	
	if (character >= 65 && character <= 90 ||
	    character >= 97 && character <= 122){
	    return true;
	}
	return false;
    }
    
    private String toLower(String str){
        String returnString = "";
	int strIndex = 0;
	int strLength = str.length();
	
	while (strIndex != strLength) {
	    if (this.isLetter(str.charAt(strIndex)) == true){
		if (str.charAt(strIndex) >= 97){
		    returnString = returnString + (char)((char)str.charAt(strIndex) - 0);
		}
		if (str.charAt(strIndex) <= 90) {
		    returnString = returnString + (char)((char)str.charAt(strIndex) + 32);
		}
	    }
	    else{
		returnString = returnString + (char)str.charAt(strIndex);
	    }
	    strIndex++;
	}
	return returnString;
    }
    
    
    private boolean rotCheckSafe(char character, int rot){
	
	int cutRot = rot % 32;
	if (this.isLetter(character) == true){
	    
	    if (character >= 97){
		if (character + cutRot > 122){
		    return false;
		}
	    }
	}

		return true; 
    }

    public char rotReg(char character, int rot){
	
	return (char)(character + rot);
    } 

    private char rotIreg(char character, int rot){

	int cutRot = rot % 32;
	int zCutRot = cutRot - (122 - character);
	return (char)(97 + zCutRot - 1);
	
    }
    

    private char[] strToArray(String str){
	char[] charArray = new char[str.length()];
	
	for (int index = 0;
	     index != str.length();
	     index++){
	    
	    charArray[index] = str.charAt(index);
	    
	}
	return charArray;
    }
	
	    
	
	
    public cypher(){
    }
    
    public cypher(String str, int rot){
	String lowerStr = this.toLower(str);
	char[] charArray = strToArray(str);
	
	for (int index = 0;
	     index != lowerStr.length();
	     index++){
	    if (this.rotCheckSafe(charArray[index]) = true) {


	}
	    
	    
	    
	
    }
	    
	
	
	
    
    
	
    
	

	
    
    
    public static void main(String[] args){
	
	//isLetter Test
	cypher eMe= new cypher();
	System.out.println(eMe.isLetter((char)3));
	System.out.println(eMe.isLetter('A'));
	System.out.println(eMe.isLetter('z'));
	
	//LOWER TEST
	System.out.println(eMe.toLower("HE   $&*& LLO"));
	
	//RotCheckSafe test
	System.out.println(eMe.rotCheckSafe('b',3498));
	System.out.println(eMe.rotCheckSafe('z',1));
	
	//RotReg and RotIreg test
	System.out.println(eMe.rotReg('a', 1));
	System.out.println(eMe.rotIreg('z', 1));
	
	//strToArray test
	System.out.println(eMe.strToArray("hello what is good"));
	System.out.println(eMe.strToArray("pinfewpifnepnfwepo")[5]);

	
			   
	
		
	
	/////////////////////////////////////////////
	
	
    }
    
    
}
	    

	
	
public class cypher{
    
    public boolean isLetter(char character) {
	
	if (character >= 65 && character <= 90 ||
	    character >= 97 && character <= 122){
	    return true;
	}
	return false;
    }
    
    public String toLower(String str){
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
    
    
    public boolean rotCheckSafe(char character, int rot){
	
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

    public char rotIreg(char character, int rot){

	int cutRot = rot % 32;
	return (char)(97 + cutRot);
	
    }
    
    public char firstCharPopRot(String str, int rot){
	String lowerStr = this.toLower(str);
	char firstChar = str.getChar(0);
	
	if (this.rotCheckSafe(firstChar, rot) = true){
	    str
	    this.rotReg(firstChar,rot);
	
    }
	
	
    public cypher(){
    }
    
    public cypher(String str, int rot){
	String lowerStr = this.toLower(str);
	
	
    }
	
    
    
	
    
	

	
    
    
    public static void main(String[] args){
	
	//isLetter Test
	cypher eMe= new cypher();
	System.out.println(eMe.isLetter((char)3));
	System.out.println(eMe.isLetter('A'));
	System.out.println(eMe.isLetter('z'));
	
	//LOWER TEST
	System.out.println(eMe.toLower("HE   $&*& LLO"));
	
	//RotCheck test
	System.out.println(eMe.rotCheckSafe('b',3498));
	System.out.println(eMe.rotCheckSafe('z',1));
		
	
	/////////////////////////////////////////////
	
	
    }
    
    
}
	    

	
	
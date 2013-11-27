public String sameEnds(String string) {
    
    int AstringCnt = 0;
    int sameInt = -1;
    int midStrI = string.length()/2;
    String midStrS = string.substring(midStrI, midStrI + 1);
    
    
    if (string.substring(1,2).equals(string.substring(string.length()))){
  
    for (int stringCnt = 1;
	 stringCnt != string.length()/2;
	 stringCnt++){
	
	AstringCnt = string.length() - stringCnt;
	
	if (string.substring(AstringCnt, AstringCnt - 1).equals(string.substring(stringCnt,stringCnt + 1))){
	    
	    sameInt = sameInt + 1;
	    
	}
	
	else{
	    
	    if (sameInt != -1){
		
		return string.substring(sameInt,stringCnt);
	    }
	}
	return "hello";
    }
    
    return "hello";
    
    }

<<<<<<< HEAD
=======
    
    return "hello";

>>>>>>> 71e7fcdd3e8c363dd5643a18c89c5cd9c77a961c
}

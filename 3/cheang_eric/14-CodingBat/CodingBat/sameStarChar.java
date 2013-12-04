public boolean sameStarChar(String str) {
    
    int countTrue = 0;
    int actualTrue = 0;

    for (int strSpdCnt = 0;
	 strSpdCnt != str.length() - 1;
	 strSpdCnt++)
	
	{if (str.substring(strSpdCnt,strSpdCnt + 1).equals("*")) 

		{countTrue = countTrue + 1;}}
    
    if (str.equals("")){
	
	return true;
	
    }
    
    if (str.length() < 3){
	
	return true;
	
    }
    
    if (str.substring(0,1).equals("*")){
	
	actualTrue = actualTrue + 1;
	
    }
    
    if (str.substring(str.length()).equals("*")){
	
	actualTrue = actualTrue + 1;
	
    }
    
    
    
    
    
    
    for (int strCnt = 0;
	 strCnt != str.length() - 1;
	 strCnt++){
	    
	String chrCheck = str.substring(strCnt,strCnt + 1);
	
	if (chrCheck.equals("*") && strCnt == 0){
	    
	    chrCheck = str.substring(strCnt + 1, strCnt + 2);
	    
	}
	
	    
	if (chrCheck.equals("*")) {
	    
	    if (str.substring(strCnt - 1, strCnt).equals(str.substring(strCnt + 1, strCnt + 2))){
		
		actualTrue = actualTrue + 1;

	    }}}
    
    if (countTrue <=  actualTrue){
	
	return true;
	    
    }
    
    else{
	
	return false;
	
    }
    
    
}
	    
	    
	
	



	
	



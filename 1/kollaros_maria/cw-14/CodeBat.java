public class CodeBat{
    // claims I am correct for all tests
    public boolean sameStarChar(String str){
	String newstring = "";
	for(int i = 0; i < str.length(); i = i + 1){
	    if (str.substring(i, i + 1).equals("*") && i == 0 || i == (str.length() - 1)){
		newstring = newstring + "true";
	    }
	    else if (str.substring(i, i + 1).equals("*")){
		if (str.substring(i - 1, i).equals(str.substring(i + 1, i + 2))){
		    newstring = newstring + "true";
		}
		else{
		    newstring = newstring + "false";
		}
	    }
	}
	if (newstring.contains("false")){
	    return false;
	}
	else{
	    return true;
	}
    }

    //claims I am correct for more than half the tests
    public String sameEnds(String string) {
	int len = string.length();
	if (string.equals("")){
	    return "";
	}
	else if (string.length() == 2){
	    if (string.substring(0,1).equals(string.substring(1))){
		return string.substring(1);
	    }
	    else{
		return "";
	    }
	}
	else if (string.length() == 3){
	    if (string.substring(0,1).equals(string.substring(2))){
		return string.substring(2);
	    }
	    else{
		return "";
	    }
	}
	else if (len % 2 == 0){
	    int a = len / 2 - 1;
	    int b = len / 2;
	    for (a = a; a > 0; a = a - 1){
		if (string.substring(0, a + 1).equals(string.substring(b))){
		    return string.substring(b);
		}
		b = b + 1;
	    }
	    return "";
	}
	else if (len % 2 != 0){
	    int a = len / 2 - 1;
	    int b = len / 2 + 1;
	    for (a = a; a > 0; a = a - 1){
		if (string.substring(0, a + 1).equals(string.substring(b))){
		    return string.substring(b);
		}
		b = b + 1;
	    }
	    return "";
	}
	else{
	    return "";
	}
     
    }

}
 

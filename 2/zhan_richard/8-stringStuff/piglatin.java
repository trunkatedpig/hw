public class piglatin{
    private String result;
    public String piglatinify(String S1){
	if (S1.substring(0,1).equalsIgnoreCase("a")){
	    result = S1+"ay";
	}
	else if (S1.substring(0,1).equalsIgnoreCase("e")){
	    result = S1 + "ay";
	}
	else if (S1.substring(0,1).equalsIgnoreCase("i")){
	    result = S1 + "ay";
	}
	else if (S1.substring(0,1).equalsIgnoreCase("o")){
	    result = S1 + "ay";
	}
	else if (S1.substring(0,1).equalsIgnoreCase("u")){
	    result = S1 + "ay";
	}
	else if (S1.substring(0,2).equalsIgnoreCase("ch")){
	    result = S1.substring(2) + S1.substring(0,2) + "ay";
	}
	else if (S1.substring(0,2).equalsIgnoreCase("sh")){
	    result = S1.substring(2) + S1.substring(0,2) + "ay";
	}
	else if (S1.substring(0,2).equalsIgnoreCase("th")){
	    result = S1.substring(2) + S1.substring(0,2) + "ay";
	}
	else {
	    result = S1.substring(1) + S1.substring(0,1) + "ay";
	}
	return result;
    }
}

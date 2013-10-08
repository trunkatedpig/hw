public class piglatin{
    private String result;
    public String piglatinify(String S1){
	if (S1.substring(0,1).equals("a")){
	    result = S1+"ay";
	}
	else if (S1.substring(0,1).equals("e")){
	    result = S1 + "ay";
	}
	else if (S1.substring(0,1).equals("i")){
	    result = S1 + "ay";
	}
	else if (S1.substring(0,1).equals("o")){
	    result = S1 + "ay";
	}
	else if (S1.substring(0,1).equals("u")){
	    result = S1 + "ay";
	}
	else {
	    result = S1.substring(1) + S1.substring(0,1) + "ay";
	}
	return result
;
    }
}
public class codingbat{
    public boolean sameStarChar(String str){
	boolean result = true;
	for (int i = 0;i<str.length()-1;i++){
	    if (str.substring(i,i+1).equals("*")){
		if ((i != 0) && (!str.substring(i-1,i).equals(str.substring(i+1,i+2)))){
		    result = false;
		    return result;
		}
	    }
	}
	return result;
    }
    public String sameEnds(String string){
	int split=string.length()/2;
	String result = "";
	for (int i = 1; i <= split;i++){
	    if (string.substring(0,i).equals(string.substring(string.length()-i))){
		result = string.substring(0,i);
	    }
	}
	return result;
    }
}


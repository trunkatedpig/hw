public class StringPractice{

    public boolean sameStarChar(String str){
	
	String left = "";
	String right = "";
	
	for(int i = 0; i < str.length(); i = i+1){
	    if (str.substring(i,i+1).equals("*")){
		left = str.substring(i-1,i);
		right = str.substring(i+1,i+2);
		if (left.equals(right) == false)
		    return false;
	    }
	}
	return true;
    }

}

				
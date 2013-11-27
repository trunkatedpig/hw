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

<<<<<<< HEAD
=======
    public String sameEnds(String string){

	String result = "";
        int l = string.length();

	for (int i = 0; i <= l/2; i = i+1){
	    for (int j = l/2; j < l; j = j+1){
		if (string.substring(0,i).equals(string.substring(j))){
		    result = result + string.substring(j);
		}
	    }
	}
	return result;
    }
>>>>>>> 71e7fcdd3e8c363dd5643a18c89c5cd9c77a961c
}

				
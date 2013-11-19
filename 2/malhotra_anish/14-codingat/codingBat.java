public class codingBat{
    public String sameEnds(String string) {
	String output = "";
	int L = string.length();
	int i = 0;
	while (i <= L/2){
	    if ((string.substring(0, i)).equals(string.substring(L-i, L))){
		output = string.substring(0, i);
	    }
	    i = i + 1;
	}
	return output;
    }
    public boolean sameStarChar(String str) {
	boolean output = true;
	for (int i = 1; i< str.length() -1; i++){
	    if (str.substring(i, i+1).equals("*")){
		if (str.substring(i-1, i).equals(str.substring(i+1, i+2))){
		    output = true;
		}
		else {
		    output = false;
		}
	    }
	}
	return output;
    }
}

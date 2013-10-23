public class CodingBat{

    public boolean sameStarChar(String str) {
	boolean r = true;
	for (int x = 1; x < str.length()-1; x = x +1){
	    if (str.substring(x,x+1).equals("*")) {
		if (!str.substring(x-1,x).equals(str.substring(x+1,x+2))){
		    r = false;
		}
	    
	    }
	}
	return r;
    }
    
    //needs to be revised
    public String sameEnds(String string) {
	int halfway = string.length() /2;
	String f = string.substring(0,halfway);
	String s = string.substring(halfway + string.length()%2);

  
	for (int i = 0; i < f.length(); i = i + 1){
	    if( f.substring (0,f.length() - i) == s.substring(i)){
		return f.substring(0,f.length()-i);
	    }
	}
	return "";
    }
  

}

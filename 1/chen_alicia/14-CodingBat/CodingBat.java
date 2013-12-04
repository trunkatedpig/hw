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
    
    public String sameEnds(String string) {
	int halfway = string.length() /2;
	String f = string.substring(0,halfway);
	String s = string.substring(halfway + (string.length()%2));
	for (int i=0; i<f.length(); i = 1 + i) {
            if (f.substring(0,f.length()-i).equals(s.substring(i))) {
                return f.substring(0,f.length()-i);
            }
        }
        return "";
    }


}

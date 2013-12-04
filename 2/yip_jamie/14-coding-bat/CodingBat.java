public class CodeBat{

public boolean sameStarChar(String str) {
    for (int i = 1; i <str.length() - 1; i ++){
	if (str.substring (i, i+1).equals ("*")){
	    if (str.substring(i-1, i).equals(str.substring(i+1, i+2))){
		i++;
		return true;}
	}
    }return false;
}
//cant figure out how to make it true if there arent really 
//anything to compare it with

public String sameEnds(String string) {
    String s = "";
    int h = string.length()/2;

    for (int i = 0; i <= h; i ++) {
        for (int g = h; g < string.length(); g ++) {
            if (string.substring(0,i).equals(string.substring(g))) {
                s = string.substring(g);
	    }
        }}
    return s;
    
}
}

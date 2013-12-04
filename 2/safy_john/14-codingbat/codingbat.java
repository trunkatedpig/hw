public class codingbat {
        
public boolean sameStarChar(String str) {
    int l = str.length();

    if ((str.split("*")[0].substring((str.length()-1), str.length()).equals
	(str.split("*")[1].substring(0, 1)))) {
	return true; }
    else {
	return false;}
}//Compiles fine but returns bizarre error when put into codingbat

public String sameEnds(String string) {
    String result = new String();
    result = "";

    for (int h1 = 0; h1 <= string.length()/2; h1 ++) {
	for (int h2 = string.length()/2; h2 < string.length(); h2 ++) {
	    if (string.substring(0,h1).equals(string.substring(h2))) {
		result = string.substring(h2);
	}
	}}
    return result;
    
}
}
    
    

    

	
     




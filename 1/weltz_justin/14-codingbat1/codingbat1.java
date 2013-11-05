//still needs work
//after a while I still couldn't get the functions to work for every case
public class codingbat1{
    public boolean sameStarChar(String str) {
	boolean answer = true;
	if (str.equals("*") || str.equals(""))
	    return true;
	for (int i = 1; i < str.length() - 1; i++){
	    if (str.substring(i,i + 1).equals("*")){
		if (str.substring(i-1,i).equals( str.substring(i+1,i+2)))
		    {
			answer = true;
		    }
		else{ answer = false;}
		
	    }
	}
	return answer;

       
    }
    //still doesnt work for some of the larger cases
    public String sameEnds(String string) {
	String answer = "";
	int length = string.length();
	if (length%2 == 1)
	    length = (length - 1)/2;
	else{ length = length/2;}
	for (int i = 1; i<= length; i++){
	    if (string.substring(0, i ).equals( string.substring( length - i, length )))
		{
		    answer = string.substring(0,i);
		}
	    else 
		{
		    return answer;
		}
	}
	return answer;
    }
}

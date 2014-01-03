public class Encrypt{
    public String encode(String s, int n){
	String result="";
	int truth = 0;
	for (int i =0; i < s.length();i++){
	    if ((((int)s.charAt(i))+n)>122)
		truth = 97 + ((((int)s.charAt(i))+n)-122);
	    else
		truth = (((int)s.charAt(i))+n);
	    result = result + Character.toString((char)truth);
	}
	return result;
    }
}

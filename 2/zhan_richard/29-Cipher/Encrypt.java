public class Encrypt{
    public String encode(String s, int n){
	String result="";
	int truth = 0;
	for (int i =0; i < s.length();i++){
	    truth = (((int)s.charAt(i))+n);
	    if (truth-n<97 || truth-n>122)
		truth = truth - n;
	    else if (truth>122)
		truth = 97 + (truth-123);	    
	    result = result + Character.toString((char)truth);
	}
	return result;
    }
}

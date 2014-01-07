

public class Cipher {

    public String encode(String original, int offset){
	String s = original.toLowerCase();
	String result = "";
	char c;

	for (int i=0;i<s.length();i++){
	    c = s.charAt(i);
	    if (c>='a' && c<='z') {
		// rotate the character
		c = (char)(((c-'a'+offset)%26)+'a');
	    }
	    result = result + c;
	}
	return result;
    }
    
    public static void main(String[] args){
	Cipher c = new Cipher();
	System.out.println(c.encode("hello",3));
    }
}

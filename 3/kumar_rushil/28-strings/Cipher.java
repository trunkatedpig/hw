public class Cipher{
    public String runCipher(String s, int n){
	String result = "";
	int k = 0;
	s = s.toLowerCase();
	for (int i = 0; i < s.length(); i ++){
	    if (s.charAt(i) + n <= 'z'){
		result = result + (char)(s.charAt(i) + n);
	    }
	    if (s.charAt(i) + n > 'z'){
		k = 'z' - s.charAt(i);
		k = n - k - 1;
		result = result + (char)('a' + k);
	    }
	}
	return result;
    }
}

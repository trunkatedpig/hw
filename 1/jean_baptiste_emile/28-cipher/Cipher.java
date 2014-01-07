public class Cipher {
    public String encode(String input,int n) {
	String s1 = input.toLowerCase();
	String ans = "";
	for (int i = 0; i < s1.length(); i++) {
	    ans = ans + (char)(s1.charAt(i) + n);
	}
	return ans;
	}
}

public class Driver {
	public static void main(String[] args) {
		System.out.println(encode("abcdefghijklmnopqrstuvwxyz",3));
	}
	public static String encode(String in, int offset) {
		
		in = in.toLowerCase();
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String out = "";
		for (int i = 0; i < in.length(); i++) {
			if (letters.contains(in.substring(i,i))) {
				int n = letters.indexOf(in.charAt(i)) + offset;
				if (n >= 26) {
					n = n - 26;
				}
				out += letters.charAt(n);
			} else {
				out += in.charAt(i);
			}
		}
		return out;
	}
}
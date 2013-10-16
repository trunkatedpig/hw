public class For {
	public boolean isPrime(int n) {
		if (n == 1) {return false;}
		
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {if (n % i == 0) {return false;}}
		
		return true;
	}
	
	public String reverse(String s) {
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {result += s.charAt(i);}
		return result;
	}
	
	public String table(int a, int b) {
		String t = "  ";
		for (int i = 1; i <= a; i++) {t += "" + i + " ";}
		t += "\n";
		
		for (int i = 1; i <= b; i++) {
			t += "" + i + " ";
			for (int j = 1; j <= a; j++) {t += "" + (i * j) + " ";}
			t += "\n";
		}
		
		return t;
	}
}
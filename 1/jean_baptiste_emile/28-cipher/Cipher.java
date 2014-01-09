public class Cipher {
    private double[] CorpusFreqs;

    public String encode(String input,int n) {
	String s1 = input.toLowerCase();
	String ans = "";
	for (int i = 0; i < s1.length(); i++) {
	    ans = ans + (char)(s1.charAt(i) + n);
	}
	return ans;
	}

    private void buildCorpusFreq(String filename) {
    	try {
            Scanner sc = new Scanner (new File(filename));
            while (sc.hasNext()) {
                String s = sc.nextLine();
                for (int i=0;i<s.length();i++) {
                  char c = s.charAt(i);
		  if (c>='a' && c<='z')
                  CorpusFreqs[c] = CorpusFreqs[c] + 1;
                }
        } catch (Exception e) {}
    }
}

public class CorpusFreqs {

    private double[] CorpusFreqs;

    private void buildCorpusFreq(String filename) {
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String l = sc.nextLine();
		String s = l.toLowerCase();
		for (int i=0;i < s.length;i++) {
		    char c = s.charAt(i);
		    CorpusFreqs[c - 97] = CorpusFreqs[c - 97] + 1;
		}
	    }
	} catch (Exception e) {}
    }

    public double[] Freqs(String filename) {
	buildCorpusFreq(filename);
	return CorpusFreqs;
    }

}
		    
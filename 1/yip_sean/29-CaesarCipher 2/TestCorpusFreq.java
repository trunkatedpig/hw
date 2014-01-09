public class TestCorpusFreq {
	public static void main(String[] args) {
		CaesarCipher c = new CaesarCipher();
		long t1 = System.nanoTime();
		c.buildcorpusFreq("Pride_and_Prejudice.txt");
		long t2 = System.nanoTime();
		System.out.println(java.util.Arrays.toString(c.corpusFreq));
		System.out.println("Time: " + (t2 - t1) + " ns / " + ((double) (t2 - t1) / 1000000) + " ms / " + ((double) (t2 - t1) / 1000000000) + " s");
	}
}
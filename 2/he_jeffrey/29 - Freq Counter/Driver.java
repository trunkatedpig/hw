import java.util.*;
import java.io.*;

public class Driver {
	private double[] corpusFreqs = new double[26], corpusTally = new double[26];
	private int tally;
	public static void main(String[] args) {
		Driver d = new Driver();
		d.buildCorpusFreq("pg100.txt");
		System.out.println(Arrays.toString(d.corpusFreqs));
	}
	private void buildCorpusFreq(String filename) {
		try {
			Scanner sc = new Scanner(new File(filename));
			while (sc.hasNext()) {
				String s = sc.nextLine();
				for (int i = 0; i < s.length();i++) {
					char c = s.charAt(i);
					if (c >= 'a' && c <= 'z') {
						int n = c - 'a';
						corpusTally[n]++;
						tally++;
					}
				}
			}
		} catch (Exception e) {
		
		}
 	for (int i = 0; i < corpusFreqs.length; i++) {
 		corpusFreqs[i] = corpusTally[i] / tally;
 	}
 	}

}
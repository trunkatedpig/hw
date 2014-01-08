import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Cipher {

    private double[] corpusFreqs = new double[26];
    private double[] backupFreqs = {8.167, 1.492, 2.782, 4.253, 12.702, 2.228, 2.015, 6.094, 6.966, 0.153, 0.772, 4.025, 2.406, 6.749, 7.507, 1.929, 0.095, 5.987, 6.327, 9.056, 2.758, 0.978, 2.360, 0.150, 1.974, 0.074}; // Taken from Wikipedia

    public String encode(String input, int o) {
        String s = input.toLowerCase();
        String crypt = "";
        for (int i=0; i<s.length(); i++) {
            char l = s.charAt(i);
            if (Character.isLetter(l))
                l = (char) ((l + o - (int)'a') % 26 + (int)'a');
            crypt += l;
        }
        return crypt;
    }

    private void buildCorpusFreqs(String filename) {
        try {
            Scanner sc = new Scanner(new File(filename));
            int totalCount = 0;
            while (sc.hasNext()) {
                String s = sc.nextLine();
                String test = s.toLowerCase();
                for (int i=0; i<test.length(); i++) {
                    char c = test.charAt(i);
                    if (Character.isLetter(c))
                        corpusFreqs[c-'a']++;
                        totalCount++;
                }
            }
            sc.close();
            for (int i=0; i<26; i++) {
                corpusFreqs[i] /= totalCount;
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not find " + filename + " to base decryption on!");
            corpusFreqs = backupFreqs;
        }
        catch (Exception e) {
            System.out.println("Error " + e + " occurred... Using backup frequencies");
            corpusFreqs = backupFreqs;
        }
    }

    public String decrypt(String s) {
        return decrypt(s, "Shakespeare.txt");
    }

    public String decrypt(String s, String filename) {
        buildCorpusFreqs(filename);
        int testLength = s.length();
        int[][] letters = new int[26][26];
        for (int e=0; e<26; e++) {
            String test = encode(s, e);
            for (int l=0; l<test.length(); l++) {
                char c = test.charAt(l);
                if (Character.isLetter(c))
                    letters[e][c-'a']++;
            }
        }
        double biggestFreq = 0;
        int offset = 0;
        for (int e=0; e<26; e++) {
            double freqComp = 0;
            for (int i=0; i<26; i++) {
                freqComp += letters[e][i] * corpusFreqs[i];
            }
            if (freqComp > biggestFreq) {
                biggestFreq = freqComp;
                offset = e;
            }
        }
        return encode(s, offset);
    }
}

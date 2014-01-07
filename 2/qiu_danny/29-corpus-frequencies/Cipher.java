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
            while (sc.hasNext()) {
                String s = sc.nextLine();
                String test = s.toLowerCase();
                for (int i=0; i<test.length(); i++) {
                    char c = test.charAt(i);
                    if (Character.isLetter(c))
                        corpusFreqs[c-'a']++;
                }
            }
            sc.close();
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
            double freqComp = letters[e][0] * corpusFreqs[0] +
                              letters[e][1] * corpusFreqs[1] +
                              letters[e][2] * corpusFreqs[2] +
                              letters[e][3] * corpusFreqs[3] +
                              letters[e][4] * corpusFreqs[4] +
                              letters[e][5] * corpusFreqs[5] +
                              letters[e][6] * corpusFreqs[6] +
                              letters[e][7] * corpusFreqs[7] +
                              letters[e][8] * corpusFreqs[8] +
                              letters[e][9] * corpusFreqs[9] +
                              letters[e][10] * corpusFreqs[10] +
                              letters[e][11] * corpusFreqs[11] +
                              letters[e][12] * corpusFreqs[12] +
                              letters[e][13] * corpusFreqs[13] +
                              letters[e][14] * corpusFreqs[14] +
                              letters[e][15] * corpusFreqs[15] +
                              letters[e][16] * corpusFreqs[16] +
                              letters[e][17] * corpusFreqs[17] +
                              letters[e][18] * corpusFreqs[18] +
                              letters[e][19] * corpusFreqs[19] +
                              letters[e][20] * corpusFreqs[20] +
                              letters[e][21] * corpusFreqs[21] +
                              letters[e][22] * corpusFreqs[22] +
                              letters[e][23] * corpusFreqs[23] +
                              letters[e][24] * corpusFreqs[24] +
                              letters[e][25] * corpusFreqs[25];
            if (freqComp > biggestFreq) {
                biggestFreq = freqComp;
                offset = e;
            }
        }
        return encode(s, offset);
    }
}

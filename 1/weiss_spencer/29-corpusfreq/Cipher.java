import java.util.*;
import java.io.*;

public class Cipher {

    private double[] CorpusFreqs = new double[26];

    public Cipher() {
        try {
            String s = "";
            Scanner sc = new Scanner(new File("Alice.txt"));
            while (sc.hasNext()) {
                s = s + sc.nextLine();
            }
            char c;
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                if (c >= 'A' && c <= 'Z')
                    c = (char)(c+32);
                if (c >= 'a' && c <='z')
                    CorpusFreqs[c-97] = CorpusFreqs[c-97] + 1.0;
            }
        }
        catch (Exception e) {}
    }

    public double[] getCF() {
        return CorpusFreqs;
    }
}

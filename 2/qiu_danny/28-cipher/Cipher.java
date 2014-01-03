public class Cipher {

    public String encode(String s, int o) {
        s = s.toLowerCase();
        String crypt = "";
        for (int i=0; i<s.length(); i++) {
            char l = s.charAt(i);
            if (Character.isLetter(l))
                l = (char) ((l + o - (int)'a') % 26 + (int)'a');
            crypt += l;
        }
        return crypt;
    }

    public String decrypt(String s) {
        int testLength = s.length();
        double[] vowelOccurrences = new double[26];
        for (int i=0; i<26; i++) {
            String test = encode(s, i);
            // Clever method for getting number of occurrences in a string from Stack Overflow
            double numA = testLength - test.replace("a", "").length();
            double numE = testLength - test.replace("e", "").length();
            double numI = testLength - test.replace("i", "").length();
            double numO = testLength - test.replace("o", "").length();
            double numU = testLength - test.replace("u", "").length();
            vowelOccurrences[i] = numA * 8.167 + numE * 12.702 + numI * 6.966 + numO * 7.507 + numU * 2.758; // Occurrences of each letter multiplied by frequency distribution accoring to Wikipedia
        }
        double biggest = 0;
        int indexFreq = 0;
        for (int i=0; i<vowelOccurrences.length; i++) {
            if (vowelOccurrences[i] > biggest) {
                biggest = vowelOccurrences[i];
                indexFreq = i;
            }
        }
        return encode(s, indexFreq);
    }
}

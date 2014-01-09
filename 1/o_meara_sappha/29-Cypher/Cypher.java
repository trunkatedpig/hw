import java.io.*;
import java.util.*;

public class Cypher{
    
    private double[] CorpusFreqs = new double[26];
    
    public String encode(String s, int n){
        s  = s.toLowerCase();
        String ans = "";
        n = n % 26;
        for (i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            // if it's not a letter, leave it alone and add as it is
            if (c > 'z' || c < 'a') {
                ans = ans + c;
            }
            else {
                // it's a letter, so we add n and then add it
                if (c + n > 'z') {
                    c = (char)(c - 26);
                }
                ans = ans + (char)(c + n);
            }
        }
        return ans;
    }
    
    public void buildCorpusFreq(String filename){
        try {
            Scanner sc = new Scanner (new File(filename));
            while(sc.hasNext()){
                String s = sc.nextLine();
                s = s.toLowerCase();
                for(int i = 0; i < s.length(); i ++){
                    char c = s.charAt(i);
                    if (c >= 'a' && c <= 'z'){
                        CorpusFreqs[c - 'a'] = CorpusFreqs[c - 'a'] + 1;
                    }
                }
            }
        }
	catch (Exception e){}
    }
    
    public static void main(String[] args){
        Cypher c = new Cypher();
        System.out.println(c.encode("hello",3));
        System.out.println(c.encode("abcxyz",3));

        c.buildCorpusFreq("data");
    }
    
}

import java.io.*;
import java.util.*;

public class CorpusFreq {

    private double[] CorpusFreqs = new double[26];

    private void buildCorpusFreqs(String filename){
        for (int i=0;i<26;i++){
            CorpusFreqs[i] = 0;
        }
        try{
            Scanner sc = new Scanner (new File(filename));
            while (sc.hasNext()){
                String s = sc.nextLine();
                s = s.toLowerCase(); 
                for (int i=0;i<s.length();i++){
                    char c = s.charAt(i);
                    if (c >= 'a' && c <= 'z'){
                        CorpusFreqs[(int)c - (int)'a'] += 1;
                    }
                }
            }
       }catch (Exception e){}
       System.out.println(Arrays.toString(CorpusFreqs));
    }

    public static void main(String[] args){
        CorpusFreq c = new CorpusFreq();
	System.out.println("a and z are between: " + (int)('a') + (int)('z'));
	c.buildCorpusFreqs("aroundTheWorldIn80Days.txt");
    }
}

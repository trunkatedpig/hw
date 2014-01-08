import java.util.*;
import java.io.*;

public class Freq{
	public double[] allFreqs;
	public double[] corpusFreqs;


	public static void main(String[] args){
		Freq f = new Freq();
		f.buildCorpusFreq("shakespeare.txt");
		for(int i = 0; i < 256; i++)
		{
			System.out.print("\"" + (char)i + "\": " + f.allFreqs[i] + "\n");
		}

		for(int i = 0; i < 26; i++)
		{
			System.out.print("\"" + (char)(i + 'a') + "\": " + f.corpusFreqs[i] + "\n");
		}
	}

	public void buildCorpusFreq(String filename){
		allFreqs = new double[256];
		corpusFreqs = new double[26];

		try{
			Scanner sc = new Scanner(new File(filename));
			while (sc.hasNext()){
				String s = sc.nextLine();
				for(int i = 0; i < s.length(); i++)
				{
					char c = s.charAt(i);
					allFreqs[c] += 1;
				}
			}
		} catch (Exception e){System.out.println("EXCEPTION");}

		for(int i = 0; i < 26; i++){
			corpusFreqs[i] = allFreqs['a' + i] + allFreqs['A' + i];
		}

	}
}

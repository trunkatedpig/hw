import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Cipher cipher = new Cipher();
	cipher.buildCorpusFreq("Book.txt");
	double[] f=cipher.getCorpusFreq();
	double total = 0;
	for (int i = 0; i < 26; i++){
	    total = total + f[i];
	}
	for (int i=0; i < 26; i++){
	    char c=(char)(i+97);
	    System.out.println(c +" "+ f[i]/total);
	}
    }
}

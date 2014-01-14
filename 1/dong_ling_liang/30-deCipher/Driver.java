import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Cipher ciph = new Cipher();
	ciph.buildCorpusFreq("Sherlock.txt");
	System.out.println(ciph.getList());
	String TEST = "Hello world. Please work, thanks.";
	System.out.println(ciph.cipherCracker(ciph.encode("To Sherlock Holmes she is always THE woman. I have seldom heard him mention her under any other name. In his eyes she eclipses and predominates the whole of her sex. It was not that he felt any emotion akin to love for Irene Adler.",1)));
	System.out.println(ciph.cipherCracker(ciph.encode(TEST, 5)));
	//	for (int i = 0; i<27; i++){
	//  System.out.println(i+ " " + ciph.encode(TEST,i) + ciph.getDist(ciph.getFreq(ciph.encode(TEST,i))));
	//	}
    }
}

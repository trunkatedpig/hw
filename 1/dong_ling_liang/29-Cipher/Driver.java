import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Cipher ciph = new Cipher();
	ciph.buildCorpusFreq("Sherlock.txt");
	System.out.println(ciph.getList());
    }
}

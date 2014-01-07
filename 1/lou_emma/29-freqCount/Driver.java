import java.io.*;
import java.util.*;

public class Driver{
	public static void main (String[] args){
		Cipher c = new Cipher();
		c.buildCorpusFreq("book.txt");
	}
}
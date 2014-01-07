import java.io.*;
import java.util.*;

public class Wordcount {
    
    private int[][] count;

    public Wordcount() {
	count = int[26][
    public void Wordcount () {
	  try {
	      Scanner sc = new Scanner (new File(filename));
	      while (sc.hasNext()) {
		  String s = sc.nextLine();
		  // do something to the line if you ened to
		  for (int i=0;i<s.length();i++) {
		      char c = s.charAt(i);
		      // do something with each character
		  }
	      }
	  }
	  catch (Exception e) {}
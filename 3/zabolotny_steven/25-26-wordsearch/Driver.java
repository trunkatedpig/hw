import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch(40,40);
	/*
	System.out.println("Added: \nforward horizonal 'Word'. \nbackward horizontal 'Back'. \nforward vertical 'Tall'. \nbackward vertical 'Fall'. \nforward northeast 'Stairs'. \nbackward northeast 'Slide'. \nforward southwest 'Wee'. \nforward northwest 'Up'. \nbackword northwest 'Reverse'. \nforward southeast 'Last'.");
	w.addWord(5,4,1,"h","Word"); 
	w.addWord(10,8,-1,"h","Back");
	w.addWord(9,7,1,"v","Tall");
	w.addWord(15,6,-1,"v","Fall");
	w.addWord(1,2,1,"ne","Stairs");
	w.addWord(15,14,-1,"ne","Slide");
	w.addWord(11,3,1,"sw","Wee");
	w.addWord(4,15,1,"nw","Up");
	w.addWord(8,12,-1,"nw","Reverse");
	w.addWord(16,15,1,"se","Last");
	System.out.println(w);
	*/
	w.add("wordlist.txt");
	System.out.println(w);
	w.fill();
	System.out.println(w);
	System.out.println(w.getWords());
    }
}


import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class Driver {
    public static void main(String[] args) {
<<<<<<< HEAD
	
	WordSearch w = new WordSearch(20,40);
	Random R = new Random();
	w.RandWords(60);
	//System.out.println(w);
	w.FillIn();
       	System.out.println(w);	
	System.out.println("WORDS:");
	for (int i = 0; i < w.length; i++){
	    if (i != 0 && i%6 == 0) System.out.println("");
	    System.out.print(w.usedWords.get(i) + " ");
    	}
	System.out.println("\n");
=======

	//////////////////////////
	// BOARD HEIGHT & WIDTH // 
	//////////////////////////
	
	int height = 30;
	int width = 120;
	
	if (args.length >= 2){
	    height = Integer.parseInt(args[0]);
	    width = Integer.parseInt(args[1]);
	}
       	//////////////////////////
	
	WordSearch w = new WordSearch(height,width);
	Random R = new Random();
	
	
	//Clear the screen:
	for (int i = 0; i < 45; i++)
	    System.out.println();
	//
	
	w.RandWords(67); //length of instrument list; crashes if higher.
	w.FillIn(); 
       	System.out.println(w + "\n");

	String spaces = "";
	for (int i = 0; i < (width/2 -5); i ++)
	    spaces = spaces + " ";
	System.out.println(spaces + "WORDS: \n");
	
	// Print used words:
	int wordsOnLine = -1;
	for (int i = 0; i < w.length; i++){
	    wordsOnLine++;
	    if (width - ((wordsOnLine+1)*14) < 0){
		wordsOnLine = 0;
		System.out.println("");
	    }
	System.out.print(w.usedWords.get(i) + " ");
    	}
	System.out.println("\n");
	//
>>>>>>> bf3a700447573c58e6a86a140ca8250ee965929c
    }
}
